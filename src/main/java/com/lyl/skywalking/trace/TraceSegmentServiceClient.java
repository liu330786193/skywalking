/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package com.lyl.skywalking.trace;

import com.alibaba.fastjson.JSON;
import com.lyl.skywalking.boot.BootService;
import com.lyl.skywalking.context.TracingContext;
import com.lyl.skywalking.context.TracingContextListener;
import com.lyl.skywalking.context.trace.TraceSegment;
import com.lyl.skywalking.logging.api.ILog;
import com.lyl.skywalking.logging.api.LogManager;
import com.lyl.skywalking.trace.buffer.BufferStrategy;
import com.lyl.skywalking.trace.consumer.IConsumer;


import java.util.List;

import static com.lyl.skywalking.conf.Config.Buffer.CHANNEL_SIZE;
import static com.lyl.skywalking.conf.Config.Jvm.BUFFER_SIZE;

/**
 * @author wusheng
 */
public class TraceSegmentServiceClient implements BootService, IConsumer<TraceSegment>, TracingContextListener {
    private static final ILog logger = LogManager.getLogger(TraceSegmentServiceClient.class);

    private long lastLogTime;
    private long segmentUplinkedCounter;
    private long segmentAbandonedCounter;
    private volatile DataCarrier<TraceSegment> carrier;

    @Override
    public void beforeBoot() throws Throwable {

    }

    @Override
    public void boot() throws Throwable {
        lastLogTime = System.currentTimeMillis();
        segmentUplinkedCounter = 0;
        segmentAbandonedCounter = 0;
        carrier = new DataCarrier<TraceSegment>(CHANNEL_SIZE, BUFFER_SIZE);
        carrier.setBufferStrategy(BufferStrategy.IF_POSSIBLE);
        carrier.consume(this, 1);
    }

    @Override
    public void afterBoot() throws Throwable {

        TracingContext.ListenerManager.add(this);
    }

    @Override
    public void shutdown() throws Throwable {
        carrier.shutdownConsumers();
    }

    @Override
    public void init() {

    }

    @Override
    public void consume(List<TraceSegment> data) {
        for (TraceSegment segment : data) {
            try {
                System.out.println("上传tracement数据" + JSON.toJSONString(data));
            } catch (Throwable t) {
                logger.error(t, "Transform and send UpstreamSegment to collector fail.");
            }
        }
        printUplinkStatus();
    }

    private void printUplinkStatus() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastLogTime > 30 * 1000) {
            lastLogTime = currentTimeMillis;
            if (segmentUplinkedCounter > 0) {
                logger.debug("{} trace segments have been sent to collector.", segmentUplinkedCounter);
                segmentUplinkedCounter = 0;
            }
            if (segmentAbandonedCounter > 0) {
                logger.debug("{} trace segments have been abandoned, cause by no available channel.", segmentAbandonedCounter);
                segmentAbandonedCounter = 0;
            }
        }
    }

    @Override
    public void onError(List<TraceSegment> data, Throwable t) {
        logger.error(t, "Try to send {} trace segments to collector, with unexpected exception.", data.size());
    }

    @Override
    public void onExit() {

    }

    @Override
    public void afterFinished(TraceSegment traceSegment) {
        if (traceSegment.isIgnore()) {
            return;
        }
        if (!carrier.produce(traceSegment)) {
            if (logger.isDebugEnable()) {
                logger.debug("One trace segment has been abandoned, cause by buffer is full.");
        }
        }
    }

}

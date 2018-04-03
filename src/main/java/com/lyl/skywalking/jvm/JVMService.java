package com.lyl.skywalking.jvm;/*
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

import com.lyl.skywalking.boot.BootService;
import com.lyl.skywalking.boot.DefaultNamedThreadFactory;
import com.lyl.skywalking.logging.api.ILog;
import com.lyl.skywalking.logging.api.LogManager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author wusheng
 */
public class JVMService implements BootService {
    private static final ILog logger = LogManager.getLogger(JVMService.class);
//    private LinkedBlockingQueue<JVMMetric> queue;
    private volatile ScheduledFuture<?> collectMetricFuture;
    private volatile ScheduledFuture<?> sendMetricFuture;
    private Sender sender;
    @Override
    public void beforeBoot() throws Throwable {
        sender = new Sender();
    }

    @Override
    public void boot() throws Throwable {
        collectMetricFuture = Executors
                .newSingleThreadScheduledExecutor(new DefaultNamedThreadFactory("JVMService-produce"))
                .scheduleAtFixedRate(sender, 0, 1, TimeUnit.SECONDS);
//        sendMetricFuture = Executors
//                .newSingleThreadScheduledExecutor(new DefaultNamedThreadFactory("JVMService-consume"))
//                .scheduleAtFixedRate(sender, 0, 1, TimeUnit.SECONDS);
    }

    @Override
    public void afterBoot() throws Throwable {

    }

    @Override
    public void shutdown() throws Throwable {
        collectMetricFuture.cancel(true);
        sendMetricFuture.cancel(true);
    }

    private class Sender implements Runnable {

        @Override
        public void run() {
            System.out.println("百里放羊");
        }

    }

}

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

package com.lyl.skywalking.context.trace;

import com.lyl.skywalking.context.util.KeyValuePair;

import java.util.LinkedList;
import java.util.List;

import com.lyl.skywalking.proto.LogMessage;

/**
 * The <code>LogDataEntity</code> represents a collection of {@link KeyValuePair},
 * contains several fields of a logging operation.
 *
 * @author wusheng
 */
public class LogDataEntity {
    private long timestamp = 0;
    private List<KeyValuePair> logs;

    private LogDataEntity(long timestamp, List<KeyValuePair> logs) {
        this.timestamp = timestamp;
        this.logs = logs;
    }

    public List<KeyValuePair> getLogs() {
        return logs;
    }

    public static class Builder {
        protected List<KeyValuePair> logs;

        public Builder() {
            logs = new LinkedList<KeyValuePair>();
        }

        public Builder add(KeyValuePair... fields) {
            for (KeyValuePair field : fields) {
                logs.add(field);
            }
            return this;
        }

        public LogDataEntity build(long timestamp) {
            return new LogDataEntity(timestamp, logs);
        }
    }

    public LogMessage transform() {
        LogMessage.Builder logMessageBuilder = LogMessage.newBuilder();
        for (KeyValuePair log : logs) {
            logMessageBuilder.addData(log.transform());
        }
        logMessageBuilder.setTime(timestamp);
        return logMessageBuilder.build();
    }
}

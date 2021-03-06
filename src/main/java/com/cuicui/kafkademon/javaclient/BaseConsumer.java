/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.cuicui.kafkademon.javaclient;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by cuilei05 on 16/3/15.
 */
public class BaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JConsumerAutoCommit.class);

    /**
     * 模拟处理消息,这里仅简单打印
     *
     * @param buffer
     */
    protected static void handle(List<ConsumerRecord<String, String>> buffer) {
        LOGGER.info("receive:{}", buffer.size());
        for (ConsumerRecord<String, String> stringStringConsumerRecord : buffer) {
            LOGGER.info("offset:" + stringStringConsumerRecord);
        }
    }
}

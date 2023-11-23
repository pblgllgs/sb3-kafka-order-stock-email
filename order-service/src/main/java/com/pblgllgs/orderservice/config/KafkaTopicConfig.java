package com.pblgllgs.orderservice.config;
/*
 *
 * @author pblgl
 * Created on 23-11-2023
 *
 */

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@RequiredArgsConstructor
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(topicName)
                .build();
    }
}

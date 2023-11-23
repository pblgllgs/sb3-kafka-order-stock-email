package com.pblgllgs.emailservice.consumer;
/*
 *
 * @author pblgl
 * Created on 23-11-2023
 *
 */

import com.pblgllgs.basedomains.dto.EmailModel;
import com.pblgllgs.basedomains.dto.OrderEvent;
import com.pblgllgs.emailservice.service.EmailService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class OrderConsumer {

    private final EmailService emailService;

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumerOrder(OrderEvent orderEvent) {
        EmailModel emailModel = EmailModel.builder()
                .userId(orderEvent.getUserId())
                .emailTo(orderEvent.getEmailTo())
                .subject(orderEvent.getSubject())
                .text(orderEvent.getText())
                .build();
        emailService.sendEmail(emailModel);
        log.info("Email sent " + orderEvent);
    }
}

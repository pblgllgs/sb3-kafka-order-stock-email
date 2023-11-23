package com.pblgllgs.orderservice.controller;
/*
 *
 * @author pblgl
 * Created on 23-11-2023
 *
 */

import com.pblgllgs.basedomains.dto.Order;
import com.pblgllgs.basedomains.dto.OrderEvent;
import com.pblgllgs.orderservice.producer.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderProducer orderProducer;

    @PostMapping
    public ResponseEntity<String> sendOrder(@RequestBody Order order) {
        OrderEvent orderEvent = OrderEvent.builder()
                .message("Order sent")
                .status("PENDING")
                .order(order)
                .emailTo(order.getEmailTo())
                .subject(order.getSubject())
                .userId(order.getUserId())
                .text(order.getText())
                .build();
        orderProducer.sendOrder(orderEvent);
        return ResponseEntity.ok("Order sent");
    }
}

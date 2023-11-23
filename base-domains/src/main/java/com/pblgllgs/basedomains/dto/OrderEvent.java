package com.pblgllgs.basedomains.dto;

import lombok.*;

/*
 *
 * @author pblgl
 * Created on 23-11-2023
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderEvent {
    private String message;
    private String status;
    private Order order;
    private long userId;
    private String emailTo;
    private String subject;
    private String text;
}

package com.pblgllgs.basedomains.dto;
/*
 *
 * @author pblgl
 * Created on 23-11-2023
 *
 */

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
    private long userId;
    private String emailTo;
    private String subject;
    private String text;

}

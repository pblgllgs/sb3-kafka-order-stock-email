package com.pblgllgs.basedomains.dto;
/*
 *
 * @author pblgl
 * Created on 23-11-2023
 *
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long emailId;
    private Long userId;

    private String emailFrom;

    private String emailTo;
    private String subject;

    private String text;

    private LocalDateTime sendDateEmail;

    private StatusEmail statusEmail;

}
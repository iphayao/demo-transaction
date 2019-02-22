package com.example.demotransaction.model.dto;

import lombok.Data;

@Data
public class TransactionRequestDto {
    private Long reqId;
    private String transRef;
    private Long merId;
    private Long subMerId;
    private Long terminalId;
    private Long bankTransId;
}

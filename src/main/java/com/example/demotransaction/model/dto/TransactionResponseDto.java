package com.example.demotransaction.model.dto;

import com.example.demotransaction.model.entity.Transaction;
import lombok.Data;

@Data
public class TransactionResponseDto {
    private Long reqId;
    private String code;
    private String msg;
    private String transRef;
    private Long merId;
    private String procCode;
    private String procMsg;
    private Long bankTransId;
    private Long transAmount;
    private String transCurrency;

}

package com.example.demotransaction.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Transaction {
    @Id
    private Long reqId;
    private String transRef;
    private Long merId;
    private Long subMerId;
    private Long terminalId;
    private Long bankTransId;
    private Long transAmount;
    private String transCurrency;
}

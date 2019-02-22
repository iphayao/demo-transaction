package com.example.demotransaction.controller;

import com.example.demotransaction.model.dto.TransactionRequestDto;
import com.example.demotransaction.model.dto.TransactionResponseDto;
import com.example.demotransaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction.service")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping
    public TransactionResponseDto inquiry(@RequestBody TransactionRequestDto dto) {
        return transactionService.inquiry(dto);
    }
}

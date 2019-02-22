package com.example.demotransaction.service;

import com.example.demotransaction.model.dto.TransactionRequestDto;
import com.example.demotransaction.model.dto.TransactionResponseDto;
import com.example.demotransaction.model.entity.Transaction;
import com.example.demotransaction.model.mapper.TransactionMapper;
import com.example.demotransaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public TransactionResponseDto inquiry(TransactionRequestDto dto) {
        Optional<Transaction> transaction = transactionRepository.findById(dto.getReqId());

        TransactionResponseDto responseDto = TransactionMapper.INSTANCE.toTransactionDto(transaction.orElse(null));

        responseDto.setCode("101");
        responseDto.setMsg("Mock Message");

        return responseDto;
    }
}

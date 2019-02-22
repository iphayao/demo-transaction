package com.example.demotransaction.model.mapper;

import com.example.demotransaction.model.dto.TransactionResponseDto;
import com.example.demotransaction.model.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mappings({
            @Mapping(source = "reqId", target = "reqId"),
            @Mapping(source = "transRef", target = "transRef"),
            @Mapping(source = "merId", target = "merId"),
            @Mapping(source = "bankTransId", target = "bankTransId"),
            @Mapping(source = "transAmount", target = "transAmount"),
            @Mapping(source = "transCurrency", target = "transCurrency")
    })
    TransactionResponseDto toTransactionDto(Transaction transaction);
}

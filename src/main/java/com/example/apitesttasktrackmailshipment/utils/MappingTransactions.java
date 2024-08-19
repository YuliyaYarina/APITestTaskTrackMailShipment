package com.example.apitesttasktrackmailshipment.utils;

import com.example.apitesttasktrackmailshipment.dto.TransactionsDTO;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Mapper(
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public abstract class MappingTransactions {



    public abstract TransactionsDTO mapToProductDto(Transactions transactions);

//    Transactions mapToProduct(TransactionsDTO dto);

//    public TransactionsDTO mapToProductDto(Transactions transactions){
//        TransactionsDTO dto = new TransactionsDTO();
//        dto.setTime(transactions.getTime());
//        dto.setPostOffice(transactions.getPostOffice());
//        dto.setStatus(transactions.getStatus());
//        dto.setPostalItems(transactions.getPostalItems());
//        return dto;
//    }
//    public Transactions mapToProduct(TransactionsDTO dto){
//        Transactions transactions = new Transactions();
//        transactions.setTime(dto.getTime());
//        transactions.setPostOffice(dto.getPostOffice());
//        transactions.setStatus(dto.getStatus());
//        transactions.setPostalItems(dto.getPostalItems());
//        return transactions;
//    }
}

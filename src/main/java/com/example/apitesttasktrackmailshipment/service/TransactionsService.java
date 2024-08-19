package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.controllers.PostalItemsController;
import com.example.apitesttasktrackmailshipment.dto.TransactionsDTO;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.repository.TransactionsRepository;
import com.example.apitesttasktrackmailshipment.utils.MappingTransactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionsService {
    @Autowired
    private TransactionsRepository repository;

    @Autowired
    private MappingTransactions mappingTransactions;

    private Logger logger = LoggerFactory.getLogger(TransactionsService.class);

    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    public void save(Transactions transactions) {
        repository.save(transactions);
    }

    public Transactions arrivalIntermediatePostOffice(Transactions transactions) {
        return repository.save(transactions);
    }

    public Object getLatestRecordById(Long id) {
        Transactions transactions = repository.findLatestById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Не найдено " + id));

        TransactionsDTO dto = mappingTransactions.mapToProductDto(transactions);
        return "СТАТУС : " + dto.getStatus() + "В ПУНКТ : " + dto.getPostOffice().getName() + dto.getPostOffice().getAddress() ;
    }

    public Object findAllById(Long id) {
        List<TransactionsDTO> list = repository.findAll().stream()
                .map(mappingTransactions::mapToProductDto)
               .collect(Collectors.toList());
        return "ИСТОРИЯ : " + list;
    }

}


package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.repository.TransactionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionsService {
    @Autowired
    private TransactionsRepository repository;

//    private Logger logger = LoggerFactory.getLogger(TransactionsService.class);

    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    public void save(Transactions transactions) {
        repository.save(transactions);
    }

    public Transactions arrivalIntermediatePostOffice(Transactions transactions) {
        return repository.save(transactions);
    }

//    public Object getLatestRecordById(Long id) {
//        Transactions transactions = repository.findLatestById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Не найдено " + id));
//
//        TransactionsDTO dto = mappingTransactions.mapToProductDto(transactions);
////        return "СТАТУС : " + dto.getStatus() + "В ПУНКТ : " + dto.getPostOffice().getName() + dto.getPostOffice().getAddress() ;
//        return dto.getPostOffice();
//    }

    public List<Transactions> findAllById(Long id) {
        return repository.findAllById(id);
//        logger.info(transactions.toString());

//        List<TransactionsDTO> dto = mappingTransactions.mapToProductDto(transactions);
////        logger.info(dto.toString());
    }

}


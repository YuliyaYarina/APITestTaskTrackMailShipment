package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.repository.TransactionsRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService {
    private TransactionsRepository repository;

    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    public void save(Transactions transactions) {
        repository.save(transactions);
    }

    public Transactions arrivalIntermediatePostOffice(Transactions transactions) {
        return repository.save(transactions);
    }
}


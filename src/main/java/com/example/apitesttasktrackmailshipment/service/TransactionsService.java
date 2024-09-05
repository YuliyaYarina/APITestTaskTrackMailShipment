package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.repository.TransactionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Transactions> findAllById(Long id) {
        return repository.findAllById(id);
    }

    public Optional<Transactions> findByIdStatus(Long id) {
        return repository.findAllById(id)
                .stream()
                .findFirst();
    }

}


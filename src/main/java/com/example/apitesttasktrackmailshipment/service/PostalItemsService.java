package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.model.enums.Status;
import com.example.apitesttasktrackmailshipment.model.enums.Type;
import com.example.apitesttasktrackmailshipment.repository.PostalItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostalItemsService {

    private PostalItemsRepository repository;

    public PostalItemsService(PostalItemsRepository repository
//            , TransactionsService transactionsService, PostOfficeService officeService
    ) {
        this.repository = repository;
    }

    public PostalItems save(PostalItems postalItems){
        return repository.save(postalItems);
    }

    public PostalItems findById(Long id) {
        return repository.findById(id).orElse(null);
    }


}

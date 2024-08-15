package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.model.Status;
import com.example.apitesttasktrackmailshipment.repository.PostalItemsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PostalItemsService {

    private PostalItemsRepository repository;

    public PostalItemsService(PostalItemsRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<PostalItems> registration(PostalItems postalItems){
        return ResponseEntity.ok(repository.save(postalItems));
    }

    public String arrivalIntermediatePostOffice(Long id, PostOffice postOffice, Status status) {
        return null;
    }

}

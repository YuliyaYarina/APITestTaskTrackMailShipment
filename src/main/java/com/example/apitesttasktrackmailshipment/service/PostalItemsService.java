package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.repository.PostalItemsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostalItemsService {

    private PostalItemsRepository repository;

    public PostalItemsService(PostalItemsRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<PostalItems> add(PostalItems postalItems){
        return ResponseEntity.ok(repository.save(postalItems));
    }
}

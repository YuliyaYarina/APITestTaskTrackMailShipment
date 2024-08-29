package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.repository.PostalItemsRepository;
import org.springframework.stereotype.Service;

@Service
public class PostalItemsService {

    private PostalItemsRepository repository;

    public PostalItemsService(PostalItemsRepository repository) {
        this.repository = repository;
    }

    public PostalItems save(PostalItems postalItems){
        return repository.save(postalItems);
    }

    public PostalItems findById(Long id) {
        return repository.findById(id).orElse(null);
    }


}

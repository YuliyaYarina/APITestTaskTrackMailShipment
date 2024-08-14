package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.repository.PostOfficeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostOfficeService {

    private final PostOfficeRepository repository;


    public PostOfficeService(PostOfficeRepository repository) {
        this.repository = repository;
    }

    public String removePostOffice(Long id) {
       if (repository.findById(id).isPresent()){
           repository.deleteById(id);
           return "Отделение успешно удалено";
       }
        return "Такого отделения нет";
    }

    public ResponseEntity<PostOffice> addPostOffice(PostOffice postOffice) {
        repository.save(postOffice);
        return ResponseEntity.ok(postOffice);
    }

     public List<PostOffice> getAllPostOffice() {
        return repository.findAll();
    }
}

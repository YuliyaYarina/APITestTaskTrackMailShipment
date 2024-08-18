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

    public ResponseEntity<String> removePostOffice(Long id) {
       if (repository.findById(id).isPresent()){
           repository.deleteById(id);
           return ResponseEntity.ok("Отделение успешно удалено");
       }
        return ResponseEntity.ok("Такого отделения нет");
    }

    public ResponseEntity<PostOffice> save(PostOffice postOffice) {
        return ResponseEntity.ok(repository.save(postOffice));
    }

     public List<PostOffice> findAll() {
        return repository.findAll();
    }

    public PostOffice findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

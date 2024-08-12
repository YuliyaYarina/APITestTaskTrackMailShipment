package com.example.apitesttasktrackmailshipment.controllers;

import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.service.PostalItemsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("postalItems")
@RestController
public class PostalItemsController {
    private PostalItemsService service;
//    private PostalItems postalItems;

//    public PostalItemsController(PostalItemsService service) {
//        this.service = service;
//    }
    @PostMapping
    public ResponseEntity<PostalItems> registration(@RequestBody PostalItems postalItems){

        return ResponseEntity.ok(postalItems);
    }

  @PutMapping("/id")
    public ResponseEntity<?> arrival(@RequestParam(name = "идентификатор почтового отправления ") Long id,
                                               @RequestBody String status){


        return ResponseEntity.ok(status
        );
    }


}


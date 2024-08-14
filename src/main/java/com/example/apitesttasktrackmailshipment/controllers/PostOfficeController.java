package com.example.apitesttasktrackmailshipment.controllers;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.service.PostOfficeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/postOffice")
@RestController
public class PostOfficeController {

    private PostOfficeService service;

    public PostOfficeController(PostOfficeService service) {
        this.service = service;
    }

    @Operation(
            summary = "Добавить почтовое отделение",
            tags = "Почтовое отделение"
    )
    @PostMapping
    public ResponseEntity<ResponseEntity<PostOffice>> addPostOffice(@RequestParam(name = "индекс") int index,
                                                                          @RequestParam(name = "название") String name,
                                                                          @RequestParam (name = "адрес") String address){
        PostOffice postOff = new PostOffice();
        postOff.setIndex(index);
        postOff.setName(name);
        postOff.setAddress(address);

      return ResponseEntity.ok(service.addPostOffice(postOff));
    }

    @Operation(
            summary = "Удалить почтовое отделение",
            tags = "Почтовое отделение"
    )
    @DeleteMapping("/id")
    public String removePostOffice(@RequestParam(name = "идентификатор почтового отправления") Long id) {

        return service.removePostOffice(id);
    }

    @Operation(
            summary = "Показать все почтовые отделения",
            tags = "Почтовое отделение"
    )
    @GetMapping
    public List<PostOffice> getAllPostOffice() {
        return service.getAllPostOffice();
    }

}

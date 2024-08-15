package com.example.apitesttasktrackmailshipment.controllers;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.model.enums.Type;
import com.example.apitesttasktrackmailshipment.service.PostalItemsService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("postalItems")
@RestController
public class PostalItemsController {

    private PostalItemsService service;

    @Operation(
            summary = "Регистрация почтового отправлении",
            tags = "Операции с почтовым отправлением"
    )
    @PostMapping("/registration")
    public ResponseEntity<ResponseEntity<PostalItems>> registration(@RequestParam(name = "имя получателя") String name,
                                                                    @RequestParam(name = "тип отправления") Type type,
                                                                    @RequestParam(name = "индекс получателя") int indexRecipient,
                                                                    @RequestParam(name = "адрес получателя") String addressRecipient,
                                                                    @RequestParam(name = "статус") List<Transactions> statuses){
        PostalItems postalItems = new PostalItems();
        postalItems.setName(name);
        postalItems.setType(type);
        postalItems.setIndexRecipient(indexRecipient);
        postalItems.setAddressRecipient(addressRecipient);
        postalItems.setTransactions(statuses);
         return ResponseEntity.ok(service.registration(postalItems));
    }

    @Operation(
            summary = "Прибытие в промежуточное почтовое отделение",
            tags = "Операции с почтовым отправлением"
    )
    @PutMapping
    public ResponseEntity<String> arrivalIntermediatePostOffice(@RequestParam(name = "идентификатор почтового отправления") Long id,
                                                                @RequestParam(name = "идентификатор почтового отправления") PostOffice postOffice,
                                                                @RequestParam(name = "идентификатор почтового отправления") Transactions status){
        return ResponseEntity.ok(service.arrivalIntermediatePostOffice(id, postOffice, status));
    }

//    @Operation(
//            summary = "Прибытие в промежуточное почтовое отделение",
//            tags = "Операции с почтовым отправлением"
//    )
//    @PutMapping
//    public ResponseEntity<String> departureFromPostOffice(@RequestParam(name = "идентификатор почтового отправления") Long id,
//                                                                @RequestParam(name = "идентификатор почтового отправления") PostOffice postOffice,
//                                                                @RequestParam(name = "идентификатор почтового отправления") Status status){
//        return ResponseEntity.ok(service.departureFromPostOffice(id, postOffice, status));
//    }



    @Operation(
            summary = "просмотр статуса и полной истории движения почтового отправления",
            tags = "Операции с почтовым отправлением",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Добавить отправление"
            )
    )
    @GetMapping("/id")
    public ResponseEntity<?> viewingStatusAndMovementsPostalItem(@RequestParam(name = "идентификатор почтового отправления") Long id) {


        return ResponseEntity.ok("postalItems");
    }
}


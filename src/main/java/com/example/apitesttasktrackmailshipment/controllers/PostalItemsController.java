package com.example.apitesttasktrackmailshipment.controllers;

//import com.example.apitesttasktrackmailshipment.dto.TransactionsDTO;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.model.enums.Status;
import com.example.apitesttasktrackmailshipment.model.enums.Type;
import com.example.apitesttasktrackmailshipment.service.PostOfficeService;
import com.example.apitesttasktrackmailshipment.service.PostalItemsService;
import com.example.apitesttasktrackmailshipment.service.TransactionsService;
//import com.example.apitesttasktrackmailshipment.utils.TransactionDTOMapping;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("postalItems")
@RestController
public class PostalItemsController {

    private final PostalItemsService service;
    private final PostOfficeService officeService;
    private final TransactionsService transactionsService;
//    private final TransactionDTOMapping mapping;
//    private MappingTransactions mapping;

    private Logger logger = LoggerFactory.getLogger(PostalItemsController.class);

    public PostalItemsController(PostalItemsService service, PostOfficeService officeService, TransactionsService transactionsService) {
        this.service = service;
        this.officeService = officeService;
        this.transactionsService = transactionsService;
//        this.mapping = mapping;
    }

    @Operation(
            summary = "Регистрация почтового отправлении",
            tags = "Операции с почтовым отправлением"
    )
    @PostMapping("/registration")
    public ResponseEntity<Transactions> registration(@RequestParam(name = "имя получателя") String name,
                                       @RequestParam(name = "тип отправления") Type type,
                                       @RequestParam(name = "индекс получателя") int indexRecipient,
                                       @RequestParam(name = "адрес получателя") String addressRecipient,
                                       @RequestParam(name = "id почтового отделения, которое принимает посылку") Long idPostOffice ){

        PostalItems postalItems = new PostalItems();
        postalItems.setName(name);
        postalItems.setType(type);
        postalItems.setIndexRecipient(indexRecipient);
        postalItems.setAddressRecipient(addressRecipient);

        service.save(postalItems);

        Transactions transactions = new Transactions();
        transactions.setPostalItems(postalItems);
        transactions.setStatus(Status.REGISTRATION);
        transactions.setPostOffice(officeService.findById(idPostOffice));
        transactionsService.save(transactions);


        return ResponseEntity.ok().build();
    }

    @Operation(
            summary = "Прибытие в промежуточное почтовое отделение",
            tags = "Операции с почтовым отправлением"
    )
    @PutMapping
    public ResponseEntity<Transactions> arrivalIntermediatePostOffice(@RequestParam(name = "идентификатор почты") Long idPostOffice,
                                                                                      @RequestParam(name = "идентификатор почтового отправления") Long idPostalItems,
                                                                                      @RequestParam(name = "статус посылки") Status status) {

        Transactions transactions = new Transactions();
        transactions.setPostOffice(officeService.findById(idPostOffice));
        transactions.setPostalItems(service.findById(idPostalItems));
        transactions.setStatus(status);

        transactionsService.arrivalIntermediatePostOffice(transactions);

        return ResponseEntity.ok().build();
    }

    @Operation(
            summary = "просмотр статуса и полной истории движения почтового отправления",
            tags = "Операции с почтовым отправлением",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "идентификатор почтового отправления"
            )
    )
    @GetMapping("/{id}")
    public ResponseEntity<List<Transactions>> viewingStatusAndMovementsPostalItem(@PathVariable Long id) {

//        System.out.println(transactionsService.findAllById(id));
//        System.out.println(transactionsService.getLatestRecordById(id));
        return ResponseEntity.ok(transactionsService.findAllById(id)
//                .stream()
//                .map(it -> mapping.mapToDTO(it))
//                .collect(Collectors.toList())
        );
    }
}


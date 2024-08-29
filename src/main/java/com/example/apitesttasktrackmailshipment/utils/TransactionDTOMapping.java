package com.example.apitesttasktrackmailshipment.utils;


import com.example.apitesttasktrackmailshipment.dto.TransactionsDTO;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import org.springframework.stereotype.Component;

@Component
public class TransactionDTOMapping {

    public TransactionsDTO mapToDTO(Transactions transactions) {
        TransactionsDTO transactionsDTO = new TransactionsDTO();
        transactionsDTO.setTime(transactions.getTime());
        transactionsDTO.setPostOfficeAdress(transactions.getPostOffice().getAddress());
        transactionsDTO.setStatus(transactions.getStatus());
        transactionsDTO.setPostalItemsId(transactions.getPostalItems().getId());

        return transactionsDTO;
    }
}

package com.example.apitesttasktrackmailshipment.utils;

import com.example.apitesttasktrackmailshipment.dto.TransactionsDTO;
import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.model.enums.Status;
import com.example.apitesttasktrackmailshipment.model.enums.Type;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MappingTransactionsTest {

    @Test
    void trancactionsToTransactionsDTO() {
//        //given
        Transactions transactions = new Transactions(new PostOffice(666000, "pochta", "8 march"), Status.REGISTRATION, new PostalItems("Yuliya", Type.PACKAGE, 6666, "8 mat"));

//        //when
        TransactionsDTO transactionsDTO;

//        //there
//        assertThat(transactionsDTO).isNotNull();

//        assertThat(transactionsDTO.getPostOffice().getAddress()).isEqualTo("8 march");
//        assertThat(transactionsDTO.getPostOffice().getIndex()).isEqualTo(666000);
//        assertThat(transactionsDTO.getPostOffice().getName()).isEqualTo("pochta");

//        assertThat(transactionsDTO.getStatus()).isEqualTo("REGISTRATION");


    }

}
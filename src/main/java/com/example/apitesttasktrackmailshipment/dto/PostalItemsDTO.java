package com.example.apitesttasktrackmailshipment.dto;

import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.model.enums.Type;
import lombok.Data;

import java.util.List;

@Data
public class PostalItemsDTO {
    Long id;
    String name;
    Type type;
    int indexRecipient ;
    String addressRecipient;
    List<Transactions> transactions;

    @Override
    public String toString() {
        return "PostalItemsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", indexRecipient=" + indexRecipient +
                ", addressRecipient='" + addressRecipient + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public PostalItemsDTO() {
    }
}

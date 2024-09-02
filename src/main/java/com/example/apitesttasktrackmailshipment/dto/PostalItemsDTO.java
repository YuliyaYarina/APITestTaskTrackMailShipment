package com.example.apitesttasktrackmailshipment.dto;


import com.example.apitesttasktrackmailshipment.model.Transactions;
import com.example.apitesttasktrackmailshipment.model.enums.Type;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Data
@Getter
@Setter
public class PostalItemsDTO {
    private Long id;
    private String name;
    private Type type;
    private int indexRecipient ;
    private String addressRecipient;

    List<Transactions> transactions;

    public PostalItemsDTO(String name, Type type, int indexRecipient, String addressRecipient, List<Transactions> transactions) {
        this.name = name;
        this.type = type;
        this.indexRecipient = indexRecipient;
        this.addressRecipient = addressRecipient;
        this.transactions = transactions;
    }

    public PostalItemsDTO() {
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostalItemsDTO that = (PostalItemsDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

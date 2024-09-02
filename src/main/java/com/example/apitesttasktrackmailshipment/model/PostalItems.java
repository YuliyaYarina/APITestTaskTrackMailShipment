package com.example.apitesttasktrackmailshipment.model;

import com.example.apitesttasktrackmailshipment.model.enums.Type;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "postal_items")
@Data
public class PostalItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Type type;
    private int indexRecipient ;
    private String addressRecipient;

   @OneToMany(mappedBy = "postalItems")
   @JsonIgnore
    private List<Transactions> transactions;

    private static long postalItemsId = 1;

    public PostalItems(String name, Type type, int indexRecipient, String addressRecipient) {
        setId(postalItemsId++);
        this.name = name;
        this.type = type;
        this.indexRecipient = indexRecipient;
        this.addressRecipient = addressRecipient;
    }

    public PostalItems() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getIndexRecipient() {
        return indexRecipient;
    }

    public void setIndexRecipient(int indexRecipient) {
        this.indexRecipient = indexRecipient;
    }

    public String getAddressRecipient() {
        return addressRecipient;
    }

    public void setAddressRecipient(String addressRecipient) {
        this.addressRecipient = addressRecipient;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostalItems that = (PostalItems) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

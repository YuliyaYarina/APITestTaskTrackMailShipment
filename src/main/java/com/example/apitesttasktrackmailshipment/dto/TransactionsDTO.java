package com.example.apitesttasktrackmailshipment.dto;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.model.enums.Status;
import lombok.Data;

import java.time.Instant;

@Data
public class TransactionsDTO {

    Long id;
    Instant time;
    PostOffice postOffice;
    Status status;
    PostalItems postalItems;


    public TransactionsDTO() {
    }

    public TransactionsDTO(Instant time, PostOffice postOffice, Status status, PostalItems postalItems) {
        this.time = time;
        this.postOffice = postOffice;
        this.status = status;
        this.postalItems = postalItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public PostOffice getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(PostOffice postOffice) {
        this.postOffice = postOffice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public PostalItems getPostalItems() {
        return postalItems;
    }

    public void setPostalItems(PostalItems postalItems) {
        this.postalItems = postalItems;
    }

    @Override
    public String toString() {
        return "TransactionsDTO{" +
                "time=" + time +
                ", postOffice=" + postOffice +
                ", status=" + status +
                ", postalItems=" + postalItems +
                '}';
    }
}

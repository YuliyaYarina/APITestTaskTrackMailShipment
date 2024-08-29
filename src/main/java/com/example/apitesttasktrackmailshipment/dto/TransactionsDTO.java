package com.example.apitesttasktrackmailshipment.dto;

import com.example.apitesttasktrackmailshipment.model.enums.Status;
import lombok.Data;

import java.time.Instant;
import java.util.Objects;

@Data
//@JsonSerialize
public class TransactionsDTO {
    private Instant time;
    private String postOfficeAdress;
    private Status status;
    private long postalItemsId;

    public TransactionsDTO() {
    }

    public TransactionsDTO( Instant time, String postOfficeAdress, Status status, long postalItemsId) {
        this.time = time;
        this.postOfficeAdress = postOfficeAdress;
        this.status = status;
        this.postalItemsId = postalItemsId;
    }
    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getPostOfficeAdress() {
        return postOfficeAdress;
    }

    public void setPostOfficeAdress(String postOfficeAdress) {
        this.postOfficeAdress = postOfficeAdress;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getPostalItemsId() {
        return postalItemsId;
    }

    public void setPostalItemsId(long postalItemsId) {
        this.postalItemsId = postalItemsId;
    }

    @Override
    public String toString() {
        return "TransactionsDTOO{" +
                ", time=" + time +
                ", postOfficeAdress='" + postOfficeAdress + '\'' +
                ", status=" + status +
                ", postalItemsId=" + postalItemsId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionsDTO that = (TransactionsDTO) o;
        return postalItemsId == that.postalItemsId && Objects.equals(time, that.time) && Objects.equals(postOfficeAdress, that.postOfficeAdress) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, postOfficeAdress, status, postalItemsId);
    }
}

package com.example.apitesttasktrackmailshipment.dto;

import com.example.apitesttasktrackmailshipment.model.enums.Status;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.Instant;
import java.util.Objects;
//@Data
//@JsonSerialize
//public class TransactionsDTO {
//    private long id;
//    private Instant time;
//    private String postOfficeAdress;
//    private Status status;
//    private long postalItemsId;
//
//    public TransactionsDTO() {
//    }
//
//    public TransactionsDTO(long id, Instant time, String postOfficeAdress, Status status, long postalItemsId) {
//        this.id = id;
//        this.time = time;
//        this.postOfficeAdress = postOfficeAdress;
//        this.status = status;
//        this.postalItemsId = postalItemsId;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Instant getTime() {
//        return time;
//    }
//
//    public void setTime(Instant time) {
//        this.time = time;
//    }
//
//    public String getPostOfficeAdress() {
//        return postOfficeAdress;
//    }
//
//    public void setPostOfficeAdress(String postOfficeAdress) {
//        this.postOfficeAdress = postOfficeAdress;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    public long getPostalItemsId() {
//        return postalItemsId;
//    }
//
//    public void setPostalItemsId(long postalItemsId) {
//        this.postalItemsId = postalItemsId;
//    }
//
//    @Override
//    public String toString() {
//        return "TransactionsDTOO{" +
//                "id=" + id +
//                ", time=" + time +
//                ", postOfficeAdress='" + postOfficeAdress + '\'' +
//                ", status=" + status +
//                ", postalItemsId=" + postalItemsId +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TransactionsDTO that = (TransactionsDTO) o;
//        return id == that.id && postalItemsId == that.postalItemsId && Objects.equals(time, that.time) && Objects.equals(postOfficeAdress, that.postOfficeAdress) && status == that.status;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, time, postOfficeAdress, status, postalItemsId);
//    }
//}

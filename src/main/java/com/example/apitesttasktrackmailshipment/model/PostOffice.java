package com.example.apitesttasktrackmailshipment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
@Entity
@Data
public class PostOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int index;
    private String name;
    private String address;

    @OneToMany(mappedBy = "postOffice")
    @JsonIgnore
    private List<Transactions> transactions;

    @Getter
    private static long postOfficeId = 1;

    public PostOffice(int index, String name, String address) {
        setId(postOfficeId++);
        this.index = index;
        this.name = name;
        this.address = address;
    }

    public PostOffice(String address) {
        this.address = address;
    }

    public PostOffice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public static long getPostOfficeId() {
        return postOfficeId;
    }

    public static void setPostOfficeId(long postOfficeId) {
        PostOffice.postOfficeId = postOfficeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostOffice that = (PostOffice) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

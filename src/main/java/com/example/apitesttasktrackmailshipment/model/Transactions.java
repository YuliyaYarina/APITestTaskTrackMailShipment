package com.example.apitesttasktrackmailshipment.model;

import com.example.apitesttasktrackmailshipment.model.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;

import java.time.Instant;
import java.util.Objects;

@Entity
@Data
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp(source = SourceType.DB)
    private Instant time;

    @ManyToOne
    @JoinColumn(name = "post_office_id")
    private PostOffice postOffice;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "postal_items_id")
    private PostalItems postalItems;

    private static long transactionsId = 1;

    public Transactions(PostOffice postOffice, Status status, PostalItems postalItems) {
        this.postOffice = postOffice;
        this.status = status;
        this.postalItems = postalItems;
    }

    public Transactions() {
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

    public static long getTransactionsId() {
        return transactionsId;
    }

    public static void setTransactionsId(long transactionsId) {
        Transactions.transactionsId = transactionsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return Objects.equals(time, that.time) && Objects.equals(postOffice, that.postOffice) && status == that.status && Objects.equals(postalItems, that.postalItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, postOffice, status, postalItems);
    }


}


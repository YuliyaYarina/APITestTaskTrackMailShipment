package com.example.apitesttasktrackmailshipment.model;

import com.example.apitesttasktrackmailshipment.model.enums.Status;
import jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "postal_office_id")
    private PostOffice postOffice;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "postal_items_id")
    private PostalItems postalItems;

    private static long transactionsId = 1;

    public Transactions( ZonedDateTime time, PostOffice postOffice, Status status, PostalItems postalItems) {
        setId(transactionsId);
        this.time = time;
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

    public PostOffice getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(PostOffice postOffice) {
        this.postOffice = postOffice;
    }

    public PostalItems getPostalItems() {
        return postalItems;
    }

    public void setPostalItems(PostalItems postalItems) {
        this.postalItems = postalItems;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", time=" + time +
                ", postOffice=" + postOffice +
                ", status=" + status +
                ", postalItems=" + postalItems +
                '}';
    }
}


package com.example.apitesttasktrackmailshipment.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statusPostalItems;

    @ManyToOne
    @JoinColumn(name = "postal_items_id")
    private PostalItems postalItems;

    private static long statusId = 1;

    public Status(String statusPostalItems, PostalItems postalItems) {
        setId(statusId++);
        this.statusPostalItems = statusPostalItems;
        this.postalItems = postalItems;
    }

    public Status() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusPostalItems() {
        return statusPostalItems;
    }

    public void setStatusPostalItems(String statusPostalItems) {
        this.statusPostalItems = statusPostalItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(statusPostalItems, status.statusPostalItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusPostalItems);
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusPostalItems='" + statusPostalItems + '\'' +
                '}';
    }
}

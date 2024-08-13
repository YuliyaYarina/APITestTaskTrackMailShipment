package com.example.apitesttasktrackmailshipment.model;

import java.util.Objects;

public class Status {
    private String statusPostalItems;

    public Status(String statusPostalItems) {
        this.statusPostalItems = statusPostalItems;
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

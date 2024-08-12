package com.example.apitesttasktrackmailshipment.model;

import com.example.apitesttasktrackmailshipment.model.enums.Type;

import java.util.Objects;

public class PostalItems {

    private Long id;
    private String name;

    private Type type;
    private int indexRecipient ;
    private String addressRecipient;
    private String status;

    public PostalItems(Long id, String name, Type type, int indexRecipient, String addressRecipient, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.indexRecipient = indexRecipient;
        this.addressRecipient = addressRecipient;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getIndexRecipient() {
        return indexRecipient;
    }

    public String getAddressRecipient() {
        return addressRecipient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "PostalItems{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", indexRecipient=" + indexRecipient +
                ", addressRecipient='" + addressRecipient + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

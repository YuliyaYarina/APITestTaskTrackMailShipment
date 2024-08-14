package com.example.apitesttasktrackmailshipment.model;

import com.example.apitesttasktrackmailshipment.model.enums.Type;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "postal_items")
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
    private List<Status> status;

    private static long postalItemsId = 1;

    public PostalItems(String name, Type type, int indexRecipient, String addressRecipient, List<Status> status) {
        setId(postalItemsId++);
        this.name = name;
        this.type = type;
        this.indexRecipient = indexRecipient;
        this.addressRecipient = addressRecipient;
        this.status = status;
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

    public Type getType() {
        return type;
    }

    public int getIndexRecipient() {
        return indexRecipient;
    }

    public String getAddressRecipient() {
        return addressRecipient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setIndexRecipient(int indexRecipient) {
        this.indexRecipient = indexRecipient;
    }

    public void setAddressRecipient(String addressRecipient) {
        this.addressRecipient = addressRecipient;
    }

    public static void setPostalItemsId(long postalItemsId) {
        PostalItems.postalItemsId = postalItemsId;
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
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
//                ", status='" + status + '\'' +
                '}';
    }
}

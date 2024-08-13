package com.example.apitesttasktrackmailshipment.model;

import java.util.Objects;

public class PostOffice {

    private Long id;
    private int index;
    private String name;
    private String address;

    public PostOffice(int index, String name, String address) {
        this.index = index;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
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

    @Override
    public String toString() {
        return "PostOffice{" +
                "id=" + id +
                ", index=" + index +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

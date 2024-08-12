package com.example.apitesttasktrackmailshipment.model;

import java.util.Objects;

public class PostOffice {
    private int index;
    private String name;
    private String address;

    public PostOffice(int index, String name, String address) {
        this.index = index;
        this.name = name;
        this.address = address;
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
        return index == that.index && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, address);
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

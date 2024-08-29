package com.example.apitesttasktrackmailshipment.dto;

import lombok.Data;

@Data
public class PostOfficeDTO {
    private Long id;
    private int index;
    private String name;
    private String address;

    public PostOfficeDTO() {
    }

    public PostOfficeDTO(Long id, int index, String name, String address) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return "PostOfficeDTO{" +
                "id=" + id +
                ", index=" + index +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package com.example.apitesttasktrackmailshipment.dto;

import lombok.Data;

@Data
public class PostOfficeDTO {
    Long id;
    int index;
    String name;
    String address;

    public PostOfficeDTO() {
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

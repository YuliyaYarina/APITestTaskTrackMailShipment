package com.example.apitesttasktrackmailshipment.utils;

import com.example.apitesttasktrackmailshipment.dto.PostalItemsDTO;
import com.example.apitesttasktrackmailshipment.model.PostalItems;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public abstract class MappingPostalItems {

    public abstract PostalItemsDTO mapToProductDto(PostalItems postalItems);
}

package com.github.localizationAPI.dataprovider.repository.mapper;

import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CityEntityMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "population", target = "population")
    CityEntity toCityEntity(City city);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "population", target = "population")
    City toCity(CityEntity cityEntity);
}

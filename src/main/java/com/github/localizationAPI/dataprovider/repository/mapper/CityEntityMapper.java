package com.github.localizationAPI.dataprovider.repository.mapper;

import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CityEntityMapper {

    CityEntity toCityEntity(City city);

    City toCity(CityEntity cityEntity);
}

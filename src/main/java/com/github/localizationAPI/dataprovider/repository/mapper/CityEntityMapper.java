package com.github.localizationAPI.dataprovider.repository.mapper;

import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CityEntityMapper {

    CityEntity INSTANCE = Mappers.getMapper(CityEntity.class);

    CityEntity toCityEntity(City city);
}

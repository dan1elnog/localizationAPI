package com.github.localizationAPI.entrypoint.controller.mapper;

import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.entrypoint.controller.request.InsertCityRequest;
import com.github.localizationAPI.entrypoint.controller.response.CityResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityControllerMapper {

    City toCity(InsertCityRequest insertCityRequest);

    CityResponse toCityResponse(City city);


}

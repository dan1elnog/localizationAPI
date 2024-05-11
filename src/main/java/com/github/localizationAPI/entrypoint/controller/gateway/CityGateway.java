package com.github.localizationAPI.entrypoint.controller.gateway;

import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.core.usecase.city.FindCitiesUseCase;
import com.github.localizationAPI.core.usecase.city.InsertCityUseCase;
import com.github.localizationAPI.entrypoint.controller.mapper.CityControllerMapper;
import com.github.localizationAPI.entrypoint.controller.request.InsertCityRequest;
import com.github.localizationAPI.entrypoint.controller.response.CityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityGateway {

    @Autowired
    private CityControllerMapper cityControllerMapper;

    @Autowired
    private InsertCityUseCase insertCityUseCase;

    @Autowired
    private FindCitiesUseCase findCitiesUseCase;

    public void insertCity(InsertCityRequest insertCityRequest){
        insertCityUseCase.execute(cityControllerMapper.toCity(insertCityRequest));
    }

    public Page<CityResponse> findCities(Pageable pageable) {
        Page<City> cityPage = findCitiesUseCase.execute(pageable);
        return cityPage.map(cityControllerMapper::toCityResponse);
    }

}

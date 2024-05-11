package com.github.localizationAPI.entrypoint.controller.gateway;

import com.github.localizationAPI.core.usecase.city.InsertCityUseCase;
import com.github.localizationAPI.entrypoint.controller.mapper.CityControllerMapper;
import com.github.localizationAPI.entrypoint.controller.request.InsertCityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityGateway {

    @Autowired
    private CityControllerMapper cityControllerMapper;

    @Autowired
    private InsertCityUseCase insertCityUseCase;

    public void insertCity(InsertCityRequest insertCityRequest){
        insertCityUseCase.execute(cityControllerMapper.toCity(insertCityRequest));
    }

}

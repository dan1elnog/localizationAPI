package com.github.localizationAPI.dataprovider.repository.impl;

import com.github.localizationAPI.core.dataprovider.city.InsertCity;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.CityRepository;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import com.github.localizationAPI.dataprovider.repository.mapper.CityEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertCityImpl implements InsertCity {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityEntityMapper cityEntityMapper;

    @Override
    public void execute(City city) {
        CityEntity cityEntity = cityEntityMapper.toCityEntity(city);
        cityRepository.save(cityEntity);
    }
}

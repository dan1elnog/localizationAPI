package com.github.localizationAPI.dataprovider.repository.impl;

import com.github.localizationAPI.core.dataprovider.city.FindCities;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.CityRepository;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import com.github.localizationAPI.dataprovider.repository.mapper.CityEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class findCitiesImpl implements FindCities {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityEntityMapper cityEntityMapper;

    @Override
    public Page<City> execute(Pageable pageable) {
        Page<CityEntity> cityEntityPage = cityRepository.findAll(pageable);
        return cityEntityPage.map(cityEntityMapper::toCity);
    }
}

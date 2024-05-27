package com.github.localizationAPI.dataprovider.repository.impl;

import com.github.localizationAPI.core.dataprovider.city.FindCitiesByName;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.CityRepository;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import com.github.localizationAPI.dataprovider.repository.mapper.CityEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindCitiesByNameImpl implements FindCitiesByName {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityEntityMapper cityEntityMapper;

    @Override
    public Page<City> execute(String name, Pageable pageable) {
        Page<CityEntity> cityEntityPage = cityRepository.findByNameContaining(name, pageable);
        return cityEntityPage.map(cityEntityMapper::toCity);
    }
}

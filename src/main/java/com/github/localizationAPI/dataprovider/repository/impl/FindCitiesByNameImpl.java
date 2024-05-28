package com.github.localizationAPI.dataprovider.repository.impl;

import com.github.localizationAPI.core.dataprovider.city.FindCitiesByName;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.CityRepository;
import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import com.github.localizationAPI.dataprovider.repository.mapper.CityEntityMapper;
import com.github.localizationAPI.dataprovider.repository.specification.CitySpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class FindCitiesByNameImpl implements FindCitiesByName {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityEntityMapper cityEntityMapper;

    @Override
    public Page<City> execute(String name, Pageable pageable) {
        Specification<CityEntity> cityEntitySpecification = CitySpecification.nameLike(name);
        Page<CityEntity> cityEntityPage = cityRepository.findAll(cityEntitySpecification, pageable);
        return cityEntityPage.map(cityEntityMapper::toCity);
    }
}

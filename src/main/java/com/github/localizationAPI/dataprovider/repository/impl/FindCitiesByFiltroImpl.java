package com.github.localizationAPI.dataprovider.repository.impl;

import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.dataprovider.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class FindCitiesByFiltroImpl {

    @Autowired
    private CityRepository cityRepository;


    public Page<City> execute(){
        //todo criar specification
        return null;
    }
}

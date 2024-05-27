package com.github.localizationAPI.config.beans;

import com.github.localizationAPI.core.dataprovider.city.FindCities;
import com.github.localizationAPI.core.dataprovider.city.FindCitiesByName;
import com.github.localizationAPI.core.dataprovider.city.InsertCity;
import com.github.localizationAPI.core.usecase.impl.city.FindCitiesByNameUseCaseImpl;
import com.github.localizationAPI.core.usecase.impl.city.FindCitiesUseCaseImpl;
import com.github.localizationAPI.core.usecase.impl.city.InsertCityUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityConfig {

    @Bean
    public FindCitiesUseCaseImpl findCitiesUseCase(FindCities findCities){
        return new FindCitiesUseCaseImpl(findCities);
    }

    @Bean
    public InsertCityUseCaseImpl insertCityUseCase(InsertCity insertCity){
        return new InsertCityUseCaseImpl(insertCity);
    }

    @Bean
    public FindCitiesByNameUseCaseImpl findCitiesByNameUseCase(FindCitiesByName findCitiesByName){
        return new FindCitiesByNameUseCaseImpl(findCitiesByName);
    }

}

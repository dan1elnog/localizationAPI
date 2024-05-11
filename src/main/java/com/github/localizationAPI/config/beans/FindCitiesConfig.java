package com.github.localizationAPI.config.beans;

import com.github.localizationAPI.core.dataprovider.city.FindCities;
import com.github.localizationAPI.core.usecase.impl.city.FindCitiesUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCitiesConfig {

    @Bean
    public FindCitiesUseCaseImpl findCitiesUseCase(FindCities findCities){
        return new FindCitiesUseCaseImpl(findCities);
    }
}

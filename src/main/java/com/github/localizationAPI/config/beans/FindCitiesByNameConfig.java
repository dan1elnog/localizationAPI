package com.github.localizationAPI.config.beans;

import com.github.localizationAPI.core.dataprovider.city.FindCitiesByName;
import com.github.localizationAPI.core.usecase.impl.city.FindCitiesByNameUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCitiesByNameConfig {

    @Bean
    public FindCitiesByNameUseCaseImpl findCitiesByNameUseCase(FindCitiesByName findCitiesByName){
        return new FindCitiesByNameUseCaseImpl(findCitiesByName);
    }
}

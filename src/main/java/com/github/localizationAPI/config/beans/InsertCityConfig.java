package com.github.localizationAPI.config.beans;

import com.github.localizationAPI.core.dataprovider.city.InsertCity;
import com.github.localizationAPI.core.usecase.impl.city.InsertCityUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCityConfig {

    @Bean
    public InsertCityUseCaseImpl insertCityUseCase(InsertCity insertCity){
        return new InsertCityUseCaseImpl(insertCity);
    }
}

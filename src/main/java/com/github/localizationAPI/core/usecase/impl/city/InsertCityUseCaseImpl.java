package com.github.localizationAPI.core.usecase.impl.city;

import com.github.localizationAPI.core.dataprovider.city.InsertCity;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.core.usecase.city.InsertCityUseCase;

public class InsertCityUseCaseImpl implements InsertCityUseCase {

    private final InsertCity insertCity;

    public InsertCityUseCaseImpl(InsertCity insertCity) {
        this.insertCity = insertCity;
    }

    @Override
    public void execute(City city) {
        insertCity.execute(city);
    }
}

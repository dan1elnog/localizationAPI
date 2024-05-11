package com.github.localizationAPI.core.usecase.impl.city;

import com.github.localizationAPI.core.dataprovider.city.FindCities;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.core.usecase.city.FindCitiesUseCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class FindCitiesUseCaseImpl implements FindCitiesUseCase {

    private final FindCities findCities;

    public FindCitiesUseCaseImpl(FindCities findCities) {
        this.findCities = findCities;
    }

    @Override
    public Page<City> execute(Pageable pageable) {
        return findCities.execute();
    }
}

package com.github.localizationAPI.core.usecase.impl.city;

import com.github.localizationAPI.core.dataprovider.city.FindCitiesByName;
import com.github.localizationAPI.core.domain.City;
import com.github.localizationAPI.core.usecase.city.FindCitiesByNameUseCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class FindCitiesByNameUseCaseImpl implements FindCitiesByNameUseCase {

    private final FindCitiesByName findCitiesByName;

    public FindCitiesByNameUseCaseImpl(FindCitiesByName findCitiesByName) {
        this.findCitiesByName = findCitiesByName;
    }

    @Override
    public Page<City> execute(String name, Pageable pageable) {
        return findCitiesByName.execute(name, pageable);
    }
}

package com.github.localizationAPI.core.usecase.city;

import com.github.localizationAPI.core.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindCitiesByNameUseCase {

    Page<City> execute(String name, Pageable pageable);
}

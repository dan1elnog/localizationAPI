package com.github.localizationAPI.core.dataprovider.city;

import com.github.localizationAPI.core.domain.City;
import org.springframework.data.domain.Page;

public interface FindCities {

    Page<City> execute();
}

package com.github.localizationAPI.core.usecase.impl.city;

import com.github.localizationAPI.core.dataprovider.city.FindCities;
import com.github.localizationAPI.core.domain.City;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import static org.mockito.Mockito.verify;

@SpringBootTest
class FindCitiesUseCaseImplTest {

    @Mock
    private FindCities findCities;

    @InjectMocks
    private FindCitiesUseCaseImpl findCitiesUseCase;

    @Test
    void testExecute(){
        Pageable pageable = PageRequest.of(0, 1);
        Page<City> execute = findCitiesUseCase.execute(pageable);

        verify(findCities).execute(pageable);
    }
}
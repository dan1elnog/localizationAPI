package com.github.localizationAPI.core.usecase.impl.city;

import com.github.localizationAPI.core.dataprovider.city.InsertCity;
import com.github.localizationAPI.core.domain.City;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@SpringBootTest
class InsertCityUseCaseImplTest {

    @Mock
    private InsertCity insertCity;

    @InjectMocks
    private InsertCityUseCaseImpl insertCityUseCase;

    @Test
    void testExecute(){
        City city = new City(1L, "Test City", 1000L);
        insertCityUseCase.execute(city);
        verify(insertCity).execute(eq(city));
    }
}
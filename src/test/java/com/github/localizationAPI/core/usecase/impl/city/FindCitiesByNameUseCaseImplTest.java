package com.github.localizationAPI.core.usecase.impl.city;

import com.github.localizationAPI.core.dataprovider.city.FindCitiesByName;
import com.github.localizationAPI.core.domain.City;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class FindCitiesByNameUseCaseImplTest {

    @Mock
    private FindCitiesByName findCitiesByName;

    @InjectMocks
    private FindCitiesByNameUseCaseImpl findCitiesByNameUseCase;

    @Test
    void testExecute(){
        Pageable pageable = PageRequest.of(0, 1);
        List<City> cities = Collections.singletonList(new City(1L, "city", 1000L));
        Page<City> page = new PageImpl<>(cities, pageable, cities.size());

        when(findCitiesByName.execute("city", pageable)).thenReturn(page);
        findCitiesByNameUseCase.execute("city", pageable);

        verify(findCitiesByName).execute(anyString(), eq(pageable));
        assertEquals(1, page.getTotalPages());
        assertEquals(1L, page.getContent().get(0).id());
        assertEquals("city", page.getContent().get(0).name());
        assertEquals(1000L, page.getContent().get(0).population());
    }
}
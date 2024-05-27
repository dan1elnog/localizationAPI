package com.github.localizationAPI.entrypoint.controller;

import com.github.localizationAPI.entrypoint.controller.gateway.CityGateway;
import com.github.localizationAPI.entrypoint.controller.request.InsertCityRequest;
import com.github.localizationAPI.entrypoint.controller.response.ApplicationResponse;
import com.github.localizationAPI.entrypoint.controller.response.CityResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/city")
public class CityController {

    @Autowired
    private CityGateway cityGateway;

    @PostMapping
    private ResponseEntity<ApplicationResponse<Void>> insertCity(@RequestBody @Valid InsertCityRequest insertCityRequest){
        cityGateway.insertCity(insertCityRequest);
        return ResponseEntity.ok(new ApplicationResponse<>(null, "city created"));
    }

    @GetMapping
    private ResponseEntity<ApplicationResponse<Page<CityResponse>>> findCities(Pageable pageable){
        Page<CityResponse> citiesResponse = cityGateway.findCities(pageable);
        return ResponseEntity.ok(new ApplicationResponse<>(citiesResponse, "cities successfully found"));
    }

    @GetMapping(path = "/{name}")
    private ResponseEntity<ApplicationResponse<Page<CityResponse>>> findCitiesByName(@PathVariable String name, Pageable pageable){
        Page<CityResponse> citiesResponse = cityGateway.findCitiesByName(name, pageable);
        return ResponseEntity.ok(new ApplicationResponse<>(citiesResponse, "cities successfully found"));
    }

}

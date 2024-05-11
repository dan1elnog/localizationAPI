package com.github.localizationAPI.entrypoint.controller;

import com.github.localizationAPI.entrypoint.controller.gateway.CityGateway;
import com.github.localizationAPI.entrypoint.controller.request.InsertCityRequest;
import com.github.localizationAPI.entrypoint.controller.response.ApplicationResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
    private ResponseEntity<ApplicationResponse<String>> findCities(){

        return ResponseEntity.ok().build();
    }

}

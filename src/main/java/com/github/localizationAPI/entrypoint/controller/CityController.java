package com.github.localizationAPI.entrypoint.controller;

import com.github.localizationAPI.entrypoint.controller.gateway.CityGateway;
import com.github.localizationAPI.entrypoint.controller.request.InsertCityRequest;
import com.github.localizationAPI.entrypoint.controller.response.ApplicationResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/city")
public class CityController {

    @Autowired
    private CityGateway cityGateway;

    @PostMapping
    private ResponseEntity<ApplicationResponse<String>> insertCity(@RequestBody @Valid InsertCityRequest insertCityRequest){
        cityGateway.insertCity(insertCityRequest);
        return ResponseEntity.ok(new ApplicationResponse<>(null, "city created"));
    }

}

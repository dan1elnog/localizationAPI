package com.github.localizationAPI.entrypoint.controller;

import com.github.localizationAPI.entrypoint.controller.response.ApplicationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/city")
public class CityController {



    @PostMapping
    private ResponseEntity<ApplicationResponse<String>> insertCity(){
        return ResponseEntity.ok( new ApplicationResponse<>("", "Cidade Criada"));
    }



}

package com.github.localizationAPI.entrypoint.controller.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record InsertCityRequest(

        @NotEmpty(message = "The \"name\" field cannot be null or empty")
        String name,

        @NotNull(message = "The \"population\" field cannot be null or empty")
        Long population
) {}

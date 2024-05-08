package com.github.localizationAPI.entrypoint.controller.response;


public record ApplicationResponse<T>(T payload, String message) {}

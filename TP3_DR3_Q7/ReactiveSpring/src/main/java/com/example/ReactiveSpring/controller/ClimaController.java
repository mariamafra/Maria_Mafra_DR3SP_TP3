package com.example.ReactiveSpring.controller;

import com.example.ReactiveSpring.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class ClimaController {
    @Autowired
    private ClimaService climaService;

    @GetMapping("/weather")
    public Mono<String> getClima(@RequestParam String country, @RequestParam String token) {
        // Token = da781857638c7d8638d6315e8acdc9b0/ Country BR
        return climaService.getClima(country, token);
    }
}

package com.example.ReactiveSpring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ClimaService {
    private final WebClient webClient;

    public ClimaService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale").build();
    }

    public Mono<String> getClima(String country, String token) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/{country}")
                        .queryParam("token", token)
                        .build(country))
                .retrieve()
                .bodyToMono(String.class);
    }
}

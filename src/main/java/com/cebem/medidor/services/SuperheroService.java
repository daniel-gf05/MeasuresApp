package com.cebem.medidor.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cebem.medidor.models.Superhero;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SuperheroService {

    @Value("${superhero.api.token}")
    private String apiToken;

    @Value("${superhero.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    private final int MAX_HERO_ID = 731; // Según la documentación de la API

    public Superhero getRandomSuperhero() {
        int randomId = new Random().nextInt(MAX_HERO_ID - 1) + 1;
        String url = String.format("%s/%s/%d", baseUrl, apiToken, randomId);
        return restTemplate.getForObject(url, Superhero.class);
    }
}

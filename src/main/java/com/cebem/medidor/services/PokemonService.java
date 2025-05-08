package com.cebem.medidor.services;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cebem.medidor.models.Pokemon;

@Service
public class PokemonService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final Random random = new Random();

    public Pokemon getPokemon(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name.toLowerCase();
        return restTemplate.getForObject(url, Pokemon.class);
    }

    public Pokemon getRandomPokemon() {
        int maxId = 1025;
        int randomId = random.nextInt(maxId) + 1;
        String url = "https://pokeapi.co/api/v2/pokemon/" + randomId;
        return restTemplate.getForObject(url, Pokemon.class);
    }
}

package com.cebem.medidor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cebem.medidor.models.Pokemon;
import com.cebem.medidor.services.PokemonService;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/pokemon/{name}")
    public String getPokemonCard(@PathVariable String name, Model model) {
        Pokemon pokemon = pokemonService.getPokemon(name);
        model.addAttribute("pokemon", pokemon);
        return "card";
    }

    @GetMapping("/pokemon/random")
    public String getRandomPokemon(Model model) {
        Pokemon pokemon = pokemonService.getRandomPokemon();
        model.addAttribute("pokemon", pokemon);
        return "card";
    }

}

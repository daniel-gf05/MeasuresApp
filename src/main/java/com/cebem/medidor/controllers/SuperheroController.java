package com.cebem.medidor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cebem.medidor.models.Superhero;
import com.cebem.medidor.services.SuperheroService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/superhero")
@RequiredArgsConstructor
public class SuperheroController {

    private final SuperheroService superheroService;

    @GetMapping("/random")
    public Superhero getRandomSuperhero() {
        return superheroService.getRandomSuperhero();
    }
}

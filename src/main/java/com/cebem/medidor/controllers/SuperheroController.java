package com.cebem.medidor.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;  // Cambiado RestController por Controller

import com.cebem.medidor.models.Superhero;
import com.cebem.medidor.services.SuperheroService;

import lombok.RequiredArgsConstructor;

@Controller  // Cambiado RestController por Controller
@RequestMapping("/api/superhero")
@RequiredArgsConstructor
public class SuperheroController {

    private final SuperheroService superheroService;

    @RequestMapping("/random")
    public String getRandomSuperhero(Model model) {
        // Obtener el superhéroe aleatorio desde el servicio
        Superhero superhero = superheroService.getRandomSuperhero();
        
        // Agregar el superhéroe al modelo para que esté disponible en la plantilla
        model.addAttribute("superhero", superhero);
    
        // Devolver el nombre de la plantilla (sin la extensión .html)
        return "superheroCard";  // Esto devolverá la vista superheroCard.html
    }
}
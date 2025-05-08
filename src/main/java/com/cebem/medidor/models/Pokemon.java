package com.cebem.medidor.models;

import lombok.Data;

@Data
public class Pokemon {
    private String name;
    private int height;
    private int weight;
    private Sprites sprites;

    @Data
    public static class Sprites {
        private String front_default;
    }
}

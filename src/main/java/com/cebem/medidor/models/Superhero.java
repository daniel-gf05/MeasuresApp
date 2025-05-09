package com.cebem.medidor.models;

import lombok.Data;

@Data
public class Superhero {
    private String id;
    private String name;
    private Powerstats powerstats;
    private Biography biography;
    private Appearance appearance;
    private Image image;

    @Data
    public static class Powerstats {
        private String intelligence;
        private String strength;
        private String speed;
        private String durability;
        private String power;
        private String combat;
    }

    @Data
    public static class Biography {
        private String fullName;
        private String placeOfBirth;
        private String publisher;
    }

    @Data
    public static class Appearance {
        private String gender;
        private String race;
    }

    @Data
    public static class Image {
        private String url;
    }
}

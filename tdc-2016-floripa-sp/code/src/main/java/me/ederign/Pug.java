package me.ederign;

public class Pug {

    private final String name;
    private final String color;
    private final Integer weight;

    public Pug( String name, String Color, Integer weight) {
        this.name = name;
        color = Color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pug{" +
                "nome='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }
}

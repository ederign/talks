package me.ederign;

public class Dog {


    private final String name;
    private final int weight;
    private final BREED breed;

    public Dog( String name, int weight, BREED BREED ) {

        this.name = name;
        this.weight = weight;
        breed = BREED;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public BREED getBreed() {
        return breed;
    }

    public enum BREED {SRD, BULLDOG, PUG}
}
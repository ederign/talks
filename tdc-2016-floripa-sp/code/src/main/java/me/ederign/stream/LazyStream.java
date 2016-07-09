package me.ederign.stream;

import me.ederign.Dog;

import java.util.Arrays;
import java.util.List;

public class LazyStream {

    public static void main( String[] args ) {

        List<Dog> dogs = Arrays.asList(
                new Dog( "Dora", 10, Dog.BREED.PUG ),
                new Dog( "Bento", 13, Dog.BREED.PUG ),
                new Dog( "Rex", 8, Dog.BREED.SRD ),
                new Dog( "Tete", 6, Dog.BREED.SRD ),
                new Dog( "Banzé", 7, Dog.BREED.SRD ),
                new Dog( "Rufus", 15, Dog.BREED.BULLDOG ) );

        String nomePrimeiroSRDMaiorDoQue5Kg =
                dogs.stream()
                        .filter( dog -> {
                            System.out.println(
                                    "filter - " + dog.getName() );
                            return dog.getBreed().equals( Dog.BREED.SRD )
                                    && dog.getWeight() > 5;
                        } )
                        .map( dog -> {
                            System.out.println(
                                    "map - " + dog.getName() );
                            return dog.getName();
                        } )
                        .findFirst()
                        .get();

        System.out.println(nomePrimeiroSRDMaiorDoQue5Kg);
    }
}

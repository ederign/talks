package me.ederign.dog;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DogGenerator {

    private static SecureRandom random = new SecureRandom();

    public static List<Dog> generate( int total ) {
        List<Dog> dogs = new ArrayList<>();
        for ( int i = 0; i < total; i++ ) {
            dogs.add( new Dog( generateName(), ( random.nextInt( 30 ) + 1 ),
                               Dog.BREED.values()[( random.nextInt( Dog.BREED.values().length ) )] ) );

        }
        return dogs;
    }

    public static List<Dog> generate2( int total ) {
        List<Dog> dogs = new LinkedList<>();
        for ( int i = 0; i < total; i++ ) {
            dogs.add( new Dog( generateName(), ( random.nextInt( 30 ) + 1 ),
                               Dog.BREED.values()[( random.nextInt( Dog.BREED.values().length ) )] ) );

        }
        return dogs;
    }

    private static String generateName() {
        return new BigInteger( 130, random ).toString( 32 );
    }

}

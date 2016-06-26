package me.ederign;

import me.ederign.dog.Dog;
import me.ederign.dog.DogGenerator;

import java.util.List;

public class ParallelStreams {

    public static void main( String[] args ) {

        List<Dog> dogs = DogGenerator.generate( 100000 );

        SimpleLap s = new SimpleLap( "INT STREAM" );
        dogs.stream()//Stream<Dog>
                .mapToInt( Dog::getWeight ) //IntStream
                .filter( weight -> weight > 10 ) //IntStream
                .sum();
        System.out.println( s.end() );

        s = new SimpleLap( "INT STREAM" );
        dogs.parallelStream()//Stream<Dog>
                .mapToInt( Dog::getWeight ) //IntStream
                .filter( weight -> weight > 10 ) //IntStream
                .sum();
        System.out.println( s.end() );
    }
}

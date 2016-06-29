package me.ederign;

import me.ederign.dog.Dog;
import me.ederign.dog.DogGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

    public static void main( String[] args ) {

        List<Dog> dogs = DogGenerator.generate2( 100000 );
        dogs.stream()
                .map( Dog::getWeight ).collect( Collectors.toList() );

        int[] nums = new int[100000];


        SimpleLap s = new SimpleLap( "INT STREAM" );
//        dogs.stream()
//                .mapToInt( Dog::getWeight )
//                .reduce( Integer.MIN_VALUE, Math::max );
//        System.out.println( s.end() );

        s = new SimpleLap( "INT STREAM 2" );
        dogs.parallelStream()
                .mapToInt( Dog::getWeight )
                .reduce( Math::max )
                .ifPresent( p -> System.out.println( "Maior peso: " + p ) );
    }
}

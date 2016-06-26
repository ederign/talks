package me.ederign;

import me.ederign.dog.Dog;
import me.ederign.dog.DogGenerator;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;

public class IntStreamsMain {


    public static void main( String[] args ) {

        //STREAMS AND PERFORMANCE
        //Stream<T> versus
        //IntStream, LongStream, DoubleStream
        List<Dog> dogs = DogGenerator.generate( 1000 );

        /*
        dogs.stream() //Stream<Dog>
                .filter( dog -> dog.getBreed().equals( Dog.BREED.PUG ) )//Stream<Dog>
                .map( Dog::getWeight )//Stream<Integer> boxing :(
                .filter( d -> d > 10 )//Stream<Integer> boxing reboxing
                .sum();

        */

        SimpleLap s = new SimpleLap( "INT STREAM - BOXING" );
        dogs.stream() //Stream<Dog>
                .filter( dog -> dog.getBreed().equals( Dog.BREED.PUG ) )//Stream<Dog>
                .map( Dog::getWeight )//Stream<Integer> boxing :(
                .filter( weight -> weight > 10 )//Stream<Integer> boxing reboxing
                .mapToInt( weight -> weight ) //IntStream
                .sum();
        System.out.println( s.end() );

        s = new SimpleLap( "INT STREAM" );
        dogs.stream()//Stream<Dog>
                .filter( dog -> dog.getBreed().equals( Dog.BREED.PUG ) )//Stream<Dog>
                .mapToInt( Dog::getWeight ) //IntStream
                .filter( weight -> weight > 10 ) //IntStream
                .sum();
        System.out.println( s.end() );

        s = new SimpleLap( "INT STREAM" );
        OptionalInt max = dogs.stream()//Stream<Dog>
                .filter( dog -> dog.getBreed().equals( Dog.BREED.PUG ) )//Stream<Dog>
                .mapToInt( Dog::getWeight ) //IntStream
                .filter( weight -> weight > 10 ) //IntStream
                .max(); //average()
        System.out.println( s.end() );


        s = new SimpleLap( "INT STREAM" );
        IntSummaryStatistics summary = dogs.stream()//Stream<Dog>
                .filter( dog -> dog.getBreed().equals( Dog.BREED.PUG ) )//Stream<Dog>
                .mapToInt( Dog::getWeight ) //IntStream
                .filter( weight -> weight > 10 ) //IntStream
                .summaryStatistics(); //average()
        System.out.println( summary );

    }
}

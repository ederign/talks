package me.ederign.stream;

import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Primes {


    public static boolean isPrime( final int number ) {
        return number > 1 &&
                IntStream.rangeClosed( 2, ( int ) Math.sqrt( number ) )
                        .noneMatch( divisor -> number % divisor == 0 );
    }


    public static int primeAfter( final int number ) {
        if ( isPrime( number + 1 ) ) {
            return number + 1;
        } else {
            return primeAfter( number + 1 );
        }
    }


    public static IntStream primesInfinityStream( int fromNumber) {
        return IntStream.iterate( primeAfter( fromNumber - 1 ), Primes::primeAfter );
    }

    public static void main( String[] args ) {

//        primesInfinityStream( 1 )
//                .limit( 10 )
//                .forEach( i -> System.out.print( i+ ", " ) );

//        primesInfinityStream( 1000 )
//                .limit( 5 )
//                .forEach( i -> System.out.print( i+ ", " ) );
    }

}

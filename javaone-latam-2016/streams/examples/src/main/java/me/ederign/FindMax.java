package me.ederign;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FindMax {

    public static void main( String[] args ) {
        final int SIZE = 100_000;
        int[] ints = new int[SIZE];
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for ( int i = 0; i < SIZE; i++ ) ints[i] = rand.nextInt();

        SimpleLap simpleLap = new SimpleLap( "IT" );
        int max = Integer.MIN_VALUE;
        for ( int i : ints ) {
            if ( i > max ) max = i;
        }
        System.out.println( "max is: " + max );
        System.out.println( simpleLap.end() );


        simpleLap = new SimpleLap( "Streams" );
        Arrays.stream( ints )
                .reduce( Math::max )
                .ifPresent( m -> System.out.println( "max is: " + m ) );
        System.out.println( simpleLap.end() );

        simpleLap = new SimpleLap( "Streams Parallel" );
        Arrays.stream( ints )
                .parallel()
                .reduce( Math::max )
                .ifPresent( m -> System.out.println( "max is: " + m ) );
        System.out.println( simpleLap.end() );
    }
}

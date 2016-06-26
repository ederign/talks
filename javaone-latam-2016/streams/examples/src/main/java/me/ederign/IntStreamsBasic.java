package me.ederign;

import java.util.stream.IntStream;

public class IntStreamsBasic {

    public static void main( String[] args ) {
        IntStream.of( 1, 2, 3);
        // > 1, 2, 3
        IntStream.range(1, 3);
        // > 1, 2
    }
}



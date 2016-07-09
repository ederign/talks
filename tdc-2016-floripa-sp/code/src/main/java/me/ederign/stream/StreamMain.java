package me.ederign.stream;

import me.ederign.Pug;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static me.ederign.Util.print;

public class StreamMain {

    public static void main( String[] args ) {

        Pug dora = new Pug( "Dora", "abricot", 10 );
        Pug bento = new Pug( "Bento", "abricot", 13 );
        Pug jesse = new Pug( "Jesse", "black", 9 );


        List<Pug> pugs = Arrays.asList( dora, bento, jesse );


        List<String> fatName = pugs.parallelStream()
                .filter( p -> dora.getWeight() > 9 )
                .sorted( comparing( Pug::getWeight ) )
                .map( Pug::getName )
                .collect( toList() );

        print( fatName );
    }
}

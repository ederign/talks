package me.ederign.predicate;

import me.ederign.Pug;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static me.ederign.Util.print;

public class PredicateMain {

    public static void main( String[] args ) {

        Pug dora = new Pug( "Dora", "abricot", 10 );
        Pug bento = new Pug( "Bento", "abricot", 13 );
        Pug jesse = new Pug( "Jesse", "black", 9 );


        List<Pug> pugs = Arrays.asList( dora, bento, jesse );

        Predicate<Pug> abricot = pug -> pug.getColor().equalsIgnoreCase( "abricot" );


        Predicate<Pug> fat = pug -> pug.getWeight() > 12;
        List<Pug> abricots = pugs.stream()
                .filter( abricot )
                .collect( toList() );

        print( abricots );

        List<Pug> fatAbricots = pugs.stream()
                .filter( fat.and( abricot ) )
                .collect( toList() );

        print( fatAbricots );


    }


}

package me.ederign.function;

import me.ederign.Pug;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static me.ederign.Util.print;

public class FunctionMain {

    public static void main( String[] args ) {

        Pug dora = new Pug( "Dora", "abricot", 10 );
        Pug bento = new Pug( "Bento", "abricot", 13 );
        Pug jesse = new Pug( "Jesse", "black", 9 );


        List<Pug> pugs = Arrays.asList( dora, bento, jesse );


        Function<Pug, String> extractName = pug -> pug.getName();

        List<String> nomes = pugs.stream()
                .map( extractName )
                .collect( Collectors.toList() );

        print( nomes );

        UnaryOperator<String> upper = s -> s.toUpperCase();

        List<String> nomesUpper = pugs.stream()
                .map( extractName.andThen( upper ) )
                .collect( Collectors.toList() );

        print( nomesUpper );

    }


}

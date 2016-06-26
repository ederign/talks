package me.ederign.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main( String[] args ) {
        Developer eder = new Developer();
        eder.bestBooks( "Java 8 in Action", "SICP", "The Little Schemer" );

        Developer dora = new Developer();
        dora.bestBooks( "Effective Java", "Pragmatic Programmer", "SICP" );


        List<Developer> devs = Arrays.asList( eder, dora );

        List<String> booksNames = devs
                .stream()
                .map( dev -> dev.getBooks() )  //Stream<Set<String>>
                .flatMap( books -> books.stream() )//Stream<String>
                .distinct()
                .collect( Collectors.toList() );

        booksNames.forEach( System.out::println );

    }
}

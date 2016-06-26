package me.ederign.demo;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Samples {

    public static void main( String[] args ) {

        Vendedor eder = new Vendedor("Eder", "Campinas");
        Vendedor pedro = new Vendedor("Pedro", "Apucarana");
        Vendedor luciano = new Vendedor("Luciano", "Piracicaba");
        Vendedor junior = new Vendedor("Junior", "Londrina");

        List<Venda> vendas = Arrays.asList(
                new Venda( eder, 2015, 100 ),
                new Venda( eder, 2016, 200 ),
                new Venda( pedro, 2015, 300 ),
                new Venda( luciano, 2015, 500 ),
                new Venda( luciano, 2015, 400 ),
                new Venda( junior, 2016, 500 ));

        List<Venda> vendas2015 =
                vendas
                        .stream()
                        .filter( venda -> venda.getAno() == 2015 )
                        .sorted( comparing( Venda::getValor ) )
                        .collect( toList() );


//        vendas2015.forEach(System.out::println);


        List<String> cidadesAtendidas =
                vendas.stream()
                        .map( venda -> venda.getVendedor().getCidade() )
                        .distinct()
                        .collect( toList() );


//        cidadesAtendidas.forEach(System.out::println);


        OptionalInt maiorVenda =
                vendas.stream()
                        .mapToInt(Venda::getValor)
                        .reduce( Integer::max );

//        maiorVenda.ifPresent( i -> System.out.println(i));

        OptionalInt total =
                vendas.stream()
                        .mapToInt(Venda::getValor)
                        .reduce( Integer::sum );

//        total.ifPresent( i -> System.out.println(i));


        Map<Vendedor, List<Venda>> vendedorPorVendas =

                vendas.stream()
                        .sorted( comparing( Venda::getValor ) )
                        .collect( groupingBy( Venda::getVendedor ) );

        System.out.println(vendedorPorVendas);

    }
}

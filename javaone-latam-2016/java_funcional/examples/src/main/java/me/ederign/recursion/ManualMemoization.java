package me.ederign.recursion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ManualMemoization {

    private Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public Integer fib( int n ) {
        if ( n == 0 || n == 1 ) return n;

        Integer result = cache.get( n );

        if ( result == null ) {
            synchronized ( cache ) {
                result = cache.get( n );

                if ( result == null ) {
                    result = fib( n - 2 ) + fib( n - 1 );
                    cache.put( n, result );
                }
            }
        }

        return result;
    }

    public static void main( String[] args ) {
        System.out.println( new ManualMemoization().fib( 30 ) );
    }
}

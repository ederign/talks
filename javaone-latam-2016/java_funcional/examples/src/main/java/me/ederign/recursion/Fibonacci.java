package me.ederign.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Fibonacci {

    private static Map<Integer, Long> memo = new HashMap<>();

    static {
        memo.put( 0, 0L ); //fibonacci(0)
        memo.put( 1, 1L ); //fibonacci(1)
    }

    public static long fibonacci( int x ) {
        return memo.computeIfAbsent( x, n -> fibonacci( n - 1 ) + fibonacci( n - 2 ) );
    }

}

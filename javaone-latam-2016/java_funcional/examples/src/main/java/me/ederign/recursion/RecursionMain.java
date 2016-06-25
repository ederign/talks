package me.ederign.recursion;

public class RecursionMain {

    public static Long fib( int n ) {
        if ( n < 2 ) {
            return new Long( n );
        } else {
            return fib( n - 1 ) + fib( n - 2 );
        }
    }
}

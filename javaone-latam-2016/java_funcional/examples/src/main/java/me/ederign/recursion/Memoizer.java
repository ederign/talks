package me.ederign.recursion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {

    public static <T, R> Function<T, R> memoize( Function<T, R> fn ) {
        Map<T, R> map = new ConcurrentHashMap<T, R>();
        return ( t ) -> map.computeIfAbsent( t, fn );
    }

}

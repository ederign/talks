package me.ederign;

import java.util.Arrays;
import java.util.List;

public class Util {


    public static void print( List abricots ) {
        System.out.println("====================");
        abricots.stream()
                .forEach( System.out::println );
    }


}

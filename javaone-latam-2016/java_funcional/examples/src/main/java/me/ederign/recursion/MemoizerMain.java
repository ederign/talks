package me.ederign.recursion;

import java.util.Date;
import java.util.function.Function;

public class MemoizerMain {

    static Integer longCalculation( Integer x ) {
        try {
            Thread.sleep( 1_000 );
        } catch ( InterruptedException ignored ) {
        }
        return x * 2;
    }

    static Function<Integer, Integer> loooongCalc = MemoizerMain::longCalculation;
    static Function<Integer, Integer> loooongCalcMemo = Memoizer.memoize( loooongCalc );

    public static void main( String[] args ) {
        System.out.println(new Date());
        loooongCalc.apply( 30 );
        System.out.println(new Date());
        loooongCalc.apply( 30 );
        System.out.println(new Date());
    }

}

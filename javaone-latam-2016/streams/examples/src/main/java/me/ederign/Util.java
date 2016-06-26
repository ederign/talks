package me.ederign;

import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.List;

public class Util {

    public static String read( String url ) {
        String result = url + "\n";
        try {
            return result + String.valueOf( Request.Get( url )
                                           .execute().returnContent() );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return result;
    }

    public static void print( List abricots ) {
        System.out.println("====================");
        abricots.stream()
                .forEach( System.out::println );
    }
}

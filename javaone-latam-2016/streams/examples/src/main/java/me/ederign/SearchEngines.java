package me.ederign;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchEngines {

    public static String query( String question ) {
        List<String> engines = new ArrayList<>();
        engines.add( "https://www.google.com/?q=" );
        engines.add( "https://duckduckgo.com/?q=" );
        engines.add( "https://www.bing.com/search?q=" );

        // get element as soon as it is available
        Optional<String> result = engines.stream().parallel().map( ( base ) -> {
            String url = base + question;
            // open connection and fetch the result
            return Util.read( url );
        } ).findAny();
        return result.get();
    }


}

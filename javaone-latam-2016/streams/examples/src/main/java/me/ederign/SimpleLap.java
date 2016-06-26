package me.ederign;

public class SimpleLap {

    long tStart;
    private String name;

    public SimpleLap( String name ) {
        this.name = name;
        this.tStart = System.currentTimeMillis();
    }

    public String end() {
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        return name + " " + String.valueOf( elapsedSeconds );
    }
}

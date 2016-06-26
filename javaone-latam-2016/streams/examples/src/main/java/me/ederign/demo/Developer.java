package me.ederign.demo;

import java.util.*;

public class Developer {

    private Set<String> books = new HashSet<>();

    public void bestBooks(String... books){
        Collections.addAll( this.books, books );
    }

    public Set<String> getBooks() {
        return books;
    }
}

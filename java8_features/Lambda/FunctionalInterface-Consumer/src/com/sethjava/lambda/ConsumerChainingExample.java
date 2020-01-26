package com.sethjava.lambda;

import java.util.function.Consumer;

public class ConsumerChainingExample {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> System.out.println(m.name +" ready to be release.");
        Consumer<Movie> c2 = m -> System.out.println(m.name +" released but it is a flop.");
        Consumer<Movie> c3 = m -> System.out.println(m.name +" storing information in database.");

        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie movie = new Movie("X-Men");
        cc.accept(movie);
    }
}

class Movie{
    String name;

    public Movie(String name) {
        super();
        this.name = name;
    }

}
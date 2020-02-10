package com.sethjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList(
	            "N40", "N36",
                "B12", "B6",
                "G54", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

	    /*List<String> gNumbers = new ArrayList<>();
	    someBingoNumbers.forEach(number -> {
	        if(number.toUpperCase().startsWith("G")){
                //System.out.println(number);
                gNumbers.add(number);
            }
        });

	    gNumbers.sort((s1, s2) -> s1.compareTo(s2));
	    gNumbers.forEach(number -> System.out.println(number));*/

	    someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

	    // More on Streams
        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "071");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        //System.out.println(concatStream.count());
        //System.out.println(concatStream.distinct().count());
        System.out.println("---------------------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        // Collect method
        System.out.println("----------Collect Method ------------");
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());
        sortedGNumbers.forEach(System.out::println);

        // Collect method
        System.out.println("----------Collect Method Overloaded ------------");
        List<String> sortedGNumbers1 = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        sortedGNumbers1.forEach(System.out::println);


    }
}

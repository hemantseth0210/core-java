/**
 * 
 */
package com.seth.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author heseth
 *
 */
public class StreamOfGenerateIterateExample {
	
	public static void main(String[] arg) {
		
		// Stream.Of
		Stream<String> streamString = Stream.of("Dan", "Andrew", "Charlie");
		streamString.forEach(System.out::println);

		//Stream.iterate
		Stream.iterate(1, x -> x*2)
				.limit(10)
				.forEach(System.out::println);
		
		//Stream.generate
		Supplier<Integer> intSupplier = new Random()::nextInt;
		Stream.generate(intSupplier)
				.limit(10)
				.forEach(System.out::println);
	}

}

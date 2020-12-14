package com.seth.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	
	public static Optional<Integer> limit(List<Integer> numbers) {
		
		return numbers.stream()
					.limit(2)
					.reduce((x,y) -> x + y );
	}
	
	public static Optional<Integer> skip(List<Integer> numbers) {
		
		return numbers.stream()
					.skip(2)
					.reduce((x,y) -> x + y );
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(6,7,8,9,10);
		
		System.out.println(limit(numbers).get());
		System.out.println(skip(numbers).get());
	}

}

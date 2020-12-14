package com.seth.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static Optional<Integer> findMaxValue(List<Integer> numbers) {
		
		return numbers.stream()
			.reduce((x,y) -> x > y ? x : y);
	}
	
	public static Optional<Integer> findMinValue(List<Integer> numbers) {
		
		return numbers.stream()
			.reduce((x,y) -> x < y ? x : y);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(6,7,8,9,10);

		System.out.println(findMaxValue(numbers).get());
		System.out.println(findMinValue(numbers).get());
	}

}

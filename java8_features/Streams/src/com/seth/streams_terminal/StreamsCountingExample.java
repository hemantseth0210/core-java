package com.seth.streams_terminal;

import java.util.stream.Collectors;

import com.seth.streams.data.StudentDataBase;

public class StreamsCountingExample {

	public static long count() {
		
		return StudentDataBase.getAllStudents().stream()
					.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		
		System.out.println(count());

	}

}

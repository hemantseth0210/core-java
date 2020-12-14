package com.seth.java.streams;

import com.seth.java.data.StudentDataBase;

public class StreamsFilterExample {

	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents()
			.stream()
			.filter(student -> student.getGender().equals("female"))
			.filter(student -> student.getGpa() >= 3.7)
			.forEach(System.out::println);
		
	}

}

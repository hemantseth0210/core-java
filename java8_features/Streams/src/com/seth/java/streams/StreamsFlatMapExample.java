package com.seth.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static void main(String[] args) {
		
		List<String> activites = StudentDataBase.getAllStudents()
			.stream() //Stream<Student>
			.map(Student::getActivities) // Stream<List<String>>
			.flatMap(List::stream)
			.collect(Collectors.toList());
		
		System.out.println(activites);

		System.out.println("----------------------------------");
		
		StudentDataBase.getAllStudents()
				.stream() //Stream<Student>
				.flatMap(student -> student.getActivities().stream())
				.forEach(System.out::println);
				
	}

}

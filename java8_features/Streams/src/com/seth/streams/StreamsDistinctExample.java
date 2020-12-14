package com.seth.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.seth.streams.data.Student;
import com.seth.streams.data.StudentDataBase;

public class StreamsDistinctExample {

	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents()
				.stream() //Stream<Student>
				.flatMap(student -> student.getActivities().stream())
				.distinct()
				.forEach(System.out::println);
				
	}

}

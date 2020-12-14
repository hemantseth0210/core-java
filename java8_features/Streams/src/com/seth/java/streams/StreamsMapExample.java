package com.seth.java.streams;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsMapExample {

	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents()
			.stream() // Stream<Student>
			//Student as input -> String as Output
			.map(Student::getName) // Stream<String>
			//String as input -> String as Output
			.map(String::toUpperCase) //Stream<String>
			.forEach(System.out::println);

	}

}

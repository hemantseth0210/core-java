package com.seth.java.streamsterminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy(){
		
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy(){
		
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		System.out.println(minBy());
		System.out.println(maxBy());
	}

}

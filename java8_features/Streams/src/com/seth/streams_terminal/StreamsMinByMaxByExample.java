package com.seth.streams_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.seth.streams.data.Student;
import com.seth.streams.data.StudentDataBase;

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

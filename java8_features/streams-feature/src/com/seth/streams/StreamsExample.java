package com.seth.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.seth.streams.data.Student;
import com.seth.streams.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Map<String, List<String>> mapOfStudents = StudentDataBase.getAllStudents()
			.stream()
			.filter(student -> student.getGradeLevel() >= 3)
			.filter(student -> student.getGpa() >= 3.9)
			.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(mapOfStudents);

	}

}

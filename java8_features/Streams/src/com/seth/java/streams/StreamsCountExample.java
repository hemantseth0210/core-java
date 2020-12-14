package com.seth.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsCountExample {

	public static void main(String[] args) {
		
		Long total = StudentDataBase.getAllStudents()
				.stream() //Stream<Student>
				.flatMap(student -> student.getActivities().stream())
				.distinct()
				.count();
		
		System.out.println(total);
				
	}

}

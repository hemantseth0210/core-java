package com.seth.java.streamsterminal;

import java.util.List;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsMappingExample {

	
	
	public static void main(String[] args) {
		
		List<String> nameList = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(nameList);
		
	}

}

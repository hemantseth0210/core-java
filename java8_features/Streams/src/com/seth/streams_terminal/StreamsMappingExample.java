package com.seth.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.seth.streams.data.Student;
import com.seth.streams.data.StudentDataBase;

public class StreamsMappingExample {

	
	
	public static void main(String[] args) {
		
		List<String> nameList = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(nameList);
		
	}

}

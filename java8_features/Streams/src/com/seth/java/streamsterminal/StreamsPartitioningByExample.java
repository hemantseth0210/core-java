package com.seth.java.streamsterminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsPartitioningByExample {

	public static void customizedPartitioningBy() {
		
		Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
												.stream()
												.collect(Collectors.partitioningBy(student -> student.getGpa() > 3.8));
		
		System.out.println(studentMap);
	}
	
	public static void customizedPartitioningBy2() {
		
		Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents()
												.stream()
												.collect(Collectors.partitioningBy(student -> student.getGpa() > 3.8, Collectors.toList()));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		customizedPartitioningBy();
		customizedPartitioningBy2();
	}

}

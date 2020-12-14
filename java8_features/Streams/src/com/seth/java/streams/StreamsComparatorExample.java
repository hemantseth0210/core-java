package com.seth.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsComparatorExample {

	public static void main(String[] args) {
		
		List<Student> sortedByName = StudentDataBase.getAllStudents()
		.stream() 
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
		
		System.out.println("Sorted by name");
		System.out.println(sortedByName);
		
		List<Student> sortedByGpa = StudentDataBase.getAllStudents()
				.stream() 
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
		
		System.out.println("Sorted by gpa");
		System.out.println(sortedByGpa);
		
		List<Student> sortedByGpaReverse = StudentDataBase.getAllStudents()
				.stream() 
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
		
		System.out.println("Sorted by gpa reverse");
		System.out.println(sortedByGpaReverse);

	}

}

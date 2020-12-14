package com.seth.java.streamsterminal;

import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avg() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(avg());
	}

}

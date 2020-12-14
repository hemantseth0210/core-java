package com.seth.streams;

import java.util.Optional;

import com.seth.streams.data.Student;
import com.seth.streams.data.StudentDataBase;

public class StreamsFindAnyFindFirstExample {

	public static Optional<Student> findAnyStudent(){
		
		 return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		
		 return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.8)
				.findFirst();
	}
	
	public static void main(String[] args) {
		
		System.out.println(findAnyStudent());
		System.out.println(findFirstStudent());
	}

}

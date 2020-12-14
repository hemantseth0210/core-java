package com.seth.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamReduceExample {

	
	public static Optional<Student> getHighestGpaStudent(){
		
		return StudentDataBase.getAllStudents()
				.stream()
				.reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,5,7);
		
		// With identity
		Integer result = numbers.stream()
							.reduce(1, (a,b) -> a*b);

		System.out.println(result);
		
		//Without identity
		Optional<Integer> resultOptional = numbers.stream()
				.reduce((a,b) -> a*b);

		System.out.println(resultOptional.get());
		
		
		System.out.println("------------------");
		
		Optional<Student> student = getHighestGpaStudent();
		if(student.isPresent()) {
			System.out.println(student.get());
		}
	}

}

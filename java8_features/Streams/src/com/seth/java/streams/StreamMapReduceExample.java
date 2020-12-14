package com.seth.java.streams;

import java.util.Optional;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamMapReduceExample {

	public static void main(String[] args) {
		
		Optional<Integer> numberOfNoteBooks = StudentDataBase.getAllStudents()
				.stream()
				.filter(student -> student.getGradeLevel() >=3)
				.map(Student::getNoteBooks)
				//.reduce((a,b) -> a+b);
				.reduce(Integer::sum);
		if(numberOfNoteBooks.isPresent()) {
			System.out.println(numberOfNoteBooks.get());
		}
	}

}

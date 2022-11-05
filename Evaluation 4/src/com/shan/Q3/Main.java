package com.shan.Q3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Marks markobj=new Marks();
		
		TreeSet<Student> list=new TreeSet<>(new Marks());
		
		list.add(new Student(11, "Sudharshan", 100, 100, 100));
		list.add(new Student(12, "Vikram", 58, 65, 40));
		list.add(new Student(13, "Dhanush", 58, 70, 50));
		list.add(new Student(14, "Vijay", 58, 68, 60));
		list.add(new Student(15, "Ajith", 58, 80, 30));
		
		
		for(Student student:list) {
		
			
			System.out.println(student);
			
		}
		

	}

}

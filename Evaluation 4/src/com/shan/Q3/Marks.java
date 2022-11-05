package com.shan.Q3;

import java.util.Comparator;

public class Marks implements Comparator<Student> {



	@Override
	public int compare(Student s1, Student s2) {
		if(s1.totalMarks()<s2.totalMarks()) {
			return 1;
		}
		else if(s1.totalMarks()>s2.totalMarks()) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}



}

package com.shan.Main;

import com.shan.UseCases.AddCourse;
import com.shan.UseCases.GetCourse;
import com.shan.UseCases.GetStudent;

public class Main {
	
	
	public static void main(String[] args) {
		AddCourse.addCourse();
		GetStudent.getStudentbyId();
		GetCourse.getCoursebyId();
	}

}

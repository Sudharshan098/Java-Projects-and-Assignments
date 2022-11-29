package com.shan.UseCases;

import java.util.Scanner;

import com.shan.CourseDao.StudentCourseDao;
import com.shan.CourseDao.StudentCourseDaoImpl;
import com.shan.Exception.StudentNotFoundException;

public class GetStudent {
	
	public static void getStudentbyId() {
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Student Roll Number");
		int id = in.nextInt();
		
		StudentCourseDao scd = new StudentCourseDaoImpl();
		try {
			scd.getStudent(id);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}

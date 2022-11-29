package com.shan.CourseDao;

import com.shan.Entity.Course;
import com.shan.Exception.CourseNotFoundException;
import com.shan.Exception.StudentNotFoundException;

public interface StudentCourseDao {

	public void addCourse(Course course);
	
	public void getStudent(int roll_no) throws StudentNotFoundException;
	
	public void getCourse(int course_id) throws CourseNotFoundException;

}

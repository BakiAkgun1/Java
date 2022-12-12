package Exam3.dataAccess.jdbc;

import Exam3.dataAccess.CourseDao;
import Exam3.entities.Course;

public class jdbcCourseDao implements CourseDao{
	
	

	public void add(Course course) {
		System.out.println("jdbc ile eklendi: "+course.getCourseId());
}
}
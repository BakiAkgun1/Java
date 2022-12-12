package Exam3.dataAccess.hybernate;

import Exam3.dataAccess.CourseDao;
import Exam3.entities.Course;

public class hybernateCourseDao implements CourseDao{
	
	

	public void add(Course course) {
		System.out.println("hybernate ile eklendi: "+course.getCourseId());
}
}

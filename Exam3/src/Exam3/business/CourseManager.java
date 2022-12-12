package Exam3.business;

import Exam3.dataAccess.CourseDao;
import Exam3.entities.Course;
import Exam3.logging.Logger;

public class CourseManager {
private CourseDao coursedao;
private Logger[] loggers;

public CourseDao getCoursedao() {
	return coursedao;
}
public void setCoursedao(CourseDao coursedao) {
	this.coursedao = coursedao;
}
public Logger[] getLoggers() {
	return loggers;
}
public void setLoggers(Logger[] loggers) {
	this.loggers = loggers;
}
public CourseManager(CourseDao coursedao,Logger[] loggers) {
	this.coursedao=coursedao;
	this.loggers=loggers;
	
}
public void add(Course course) {
	if(course.getPrice()<0) {
		System.out.println("Course price must be equals and greater than 0");
	}
	else {
		Course[] courses= {new Course(1,"C#",100), new Course(2, "Java", 120),
				new Course(3, "JavaScript", 90) };
		for(Course course1:courses) {
			if(course.getCourseName()==course1.getCourseName()) {
				System.out.println("course name can't be same");
				System.exit(1);
			}
			
	}
   getCoursedao().add(course);

for(Logger logger:loggers) {
	logger.log(course.getCourseName()+"kursa eklendi");
}

}
}
}

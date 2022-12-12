package Exam3;

import Exam3.business.CategoryManager;
import Exam3.business.CourseManager;
import Exam3.business.InstructorManager;
import Exam3.dataAccess.hybernate.hybernateCourseDao;
import Exam3.dataAccess.jdbc.jdbcCategoryDao;
import Exam3.dataAccess.jdbc.jdbcInstructorDao;
import Exam3.entities.Category;
import Exam3.entities.Course;
import Exam3.entities.Instructor;
import Exam3.logging.DatabaseLogger;
import Exam3.logging.FileLogger;
import Exam3.logging.Logger;
import Exam3.logging.MailLogger;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};

		Category category= new Category(4,"Artificiel Intelligent");
		
		CategoryManager categoryManager= new CategoryManager(new jdbcCategoryDao(),loggers);
	
		categoryManager.add(category);
		
		
		System.out.println("\n\n\n");
		
		Course course1= new Course(4,"Python",100);
		CourseManager courseManager=new CourseManager(new hybernateCourseDao(), loggers);
		courseManager.add(course1);
		System.out.println("\n\n\n");
		
		Instructor instructor =new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager=new InstructorManager(new jdbcInstructorDao(), loggers);
		instructorManager.add(instructor);

		}
		
		
		
	
		
		
		
	}



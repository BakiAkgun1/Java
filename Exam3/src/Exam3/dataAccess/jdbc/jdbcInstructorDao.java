package Exam3.dataAccess.jdbc;

import Exam3.dataAccess.InstructorDao;
import Exam3.entities.Instructor;

public class jdbcInstructorDao implements InstructorDao {
public void add(Instructor instructor) {
	System.out.println("jdbc ile eklendi: "+instructor.getFirstName());
}
}

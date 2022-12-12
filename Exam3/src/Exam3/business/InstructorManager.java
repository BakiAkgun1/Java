package Exam3.business;


import Exam3.dataAccess.InstructorDao;
import Exam3.entities.Instructor;
import Exam3.logging.Logger;

public class InstructorManager {
private InstructorDao instructorDao;
private Logger[] loggers;
public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
	this.instructorDao=instructorDao;
	this.loggers=loggers;
}
public void add(Instructor instructor) {
	System.out.println("added Instructor");
	instructorDao.add(instructor);
	for(Logger logger:loggers) {
		logger.log(instructor.getFirstName() +""+instructor.getLastName());
	}
}
}

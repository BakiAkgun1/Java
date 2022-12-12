package Exam3.logging;

public class DatabaseLogger implements Logger{


	public void log(String data) {
		 System.out.println("logged to database: "+data);
	}

}

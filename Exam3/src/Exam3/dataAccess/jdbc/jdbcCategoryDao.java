package Exam3.dataAccess.jdbc;

import Exam3.entities.Category;

public class jdbcCategoryDao {
public void add(Category category) {
	System.out.println("added with jdbc: "+category.getCategoryName());
}
}

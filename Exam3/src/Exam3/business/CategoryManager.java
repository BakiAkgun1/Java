package Exam3.business;

import Exam3.dataAccess.CategoryDao;
import Exam3.dataAccess.jdbc.jdbcCategoryDao;
import Exam3.entities.Category;
import Exam3.logging.Logger;

public class CategoryManager {
private CategoryDao categoryDao;
private Logger[] loggers;
public CategoryManager(jdbcCategoryDao jdbcCategoryDao, Logger[] loggers2) {
	// TODO Auto-generated constructor stub
}
public CategoryDao getCategoryDao() {
	return categoryDao;
}
public void setCategoryDao(CategoryDao categoryDao) {
	this.categoryDao = categoryDao;
}
public Logger[] getLoggers() {
	return loggers;
}
public void setLoggers(Logger[] loggers) {
	this.loggers = loggers;
}
public void CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
	this.categoryDao=categoryDao;
	this.loggers=loggers;
	
}
public void add(Category category) {
Category[] categories= {new Category(1,"Backend"),new Category(2,"Frontend"),new Category(3,"Android")};

for(Category category1:categories) {
	if(category1.getCategoryName()==category.getCategoryName()) {
		System.out.println("Category names can't be same");
		System.exit(1);
	}
}
categoryDao.add(category);
for(Logger logger:loggers) {
	logger.log(category.getCategoryName()+"added to category ");
}
}


}
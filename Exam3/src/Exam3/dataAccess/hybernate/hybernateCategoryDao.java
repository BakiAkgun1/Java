package Exam3.dataAccess.hybernate;

import Exam3.dataAccess.CategoryDao;
import Exam3.entities.Category;

public class hybernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("added with hybernate: "+category.getCategoryName());
	}
}

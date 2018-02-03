package net.anu.shoppingbackend.dao;

import java.util.List;

import net.anu.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}

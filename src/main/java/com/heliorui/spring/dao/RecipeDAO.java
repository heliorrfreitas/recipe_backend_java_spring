package com.heliorui.spring.dao;

import java.util.List;

import com.heliorui.spring.model.Recipe;

public interface RecipeDAO {

	Long save(Recipe recipe);
	
	Recipe get(long id);
	
	List<Recipe> getAll();
	
	void update(long id, Recipe recipe);
	
	void delete(long id);
	
}

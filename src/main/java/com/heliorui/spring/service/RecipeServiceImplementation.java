package com.heliorui.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliorui.spring.dao.RecipeDAO;
import com.heliorui.spring.model.Recipe;

@Service
public class RecipeServiceImplementation implements RecipeService{

	@Autowired
	private RecipeDAO recipeDAO;
	
	@Override
	@Transactional
	public Long save(Recipe recipe) {
		return recipeDAO.save(recipe);
	}

	@Override
	@Transactional
	public Recipe get(long id) {
		return recipeDAO.get(id);
	}

	@Override
	@Transactional
	public List<Recipe> getAll() {
		return recipeDAO.getAll();
	}

	@Override
	@Transactional
	public void update(long id, Recipe recipe) {
		recipeDAO.update(id, recipe);
	}

	@Override
	@Transactional
	public void delete(long id) {
		recipeDAO.delete(id);
	}

}

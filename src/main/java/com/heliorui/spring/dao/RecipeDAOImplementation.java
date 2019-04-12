package com.heliorui.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.heliorui.spring.model.Recipe;

@Repository
public class RecipeDAOImplementation implements RecipeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Long save(Recipe recipe) {
		sessionFactory.getCurrentSession().save(recipe);
		return recipe.getId();
	}

	@Override
	public Recipe get(long id) {
		return sessionFactory.getCurrentSession().get(Recipe.class, id);
	}

	@Override
	public List<Recipe> getAll() {
		List<Recipe> recipes = sessionFactory.getCurrentSession().createQuery("from recipe").list();
		return recipes;
	}

	@Override
	public void update(long id, Recipe recipe) {
		Session session = sessionFactory.getCurrentSession();
		Recipe previousRecipe = session.byId(Recipe.class).load(id);
		previousRecipe.setName(recipe.getName());
		previousRecipe.setIngredients(recipe.getIngredients());
		previousRecipe.setPreparation(recipe.getPreparation());
		session.flush();
	}

	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Recipe recipe = session.byId(Recipe.class).load(id);
		session.delete(recipe);
	}

}

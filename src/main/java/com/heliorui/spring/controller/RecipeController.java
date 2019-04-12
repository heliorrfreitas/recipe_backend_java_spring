package com.heliorui.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.heliorui.spring.model.Recipe;
import com.heliorui.spring.service.RecipeService;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	@PostMapping("/api/recipe")
	public ResponseEntity<?> save(@RequestBody Recipe recipe){
		recipeService.save(recipe);
		return ResponseEntity.ok().body("The recipe was included!");
	}
	
	@GetMapping("/api/recipe")
	public ResponseEntity<List<Recipe>> getAll(){
		List<Recipe> recipes = recipeService.getAll();
		return ResponseEntity.ok().body(recipes);
	}
	
	@GetMapping("/api/recipe/{id}")
	public ResponseEntity<Recipe> get(@PathVariable("id") long id){
		Recipe recipe = recipeService.get(id);
		return ResponseEntity.ok().body(recipe);
	}
	
	@PutMapping("/api/recipe/{id}")
	public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Recipe recipe){
		recipeService.update(id, recipe);
		return ResponseEntity.ok().body("The recipe has been update sucessfully!");
	}
	
	@DeleteMapping("/api/recipe/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id){
		recipeService.delete(id);
		return ResponseEntity.ok().body("The recipe was deleted!");
	}
	
	
	
	
	
	
	
	
	
}

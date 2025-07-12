package com.example.recipe;

import com.example.recipe.RecipeRepository;
import com.example.recipe.Recipe;

import java.util.*;

// Don't modify the below code

public class RecipeService implements RecipeRepository {

        private static HashMap<Integer, Recipe> recipeBook = new HashMap<>();

        public RecipeService() {
                recipeBook.put(1,
                                new Recipe(1, "Pasta", "veg",
                                                Arrays.asList("pasta", "tomatoes", "olive oil", "garlic", "basil")));
                recipeBook.put(2, new Recipe(2, "Chicken Curry", "non-veg",
                                Arrays.asList("chicken", "onion", "tomato", "ginger", "garlic", "spices")));
                recipeBook.put(3, new Recipe(3, "Sushi", "non-veg",
                                Arrays.asList("sushi rice", "tuna fish", "seaweed", "wasabi", "ginger")));
                recipeBook.put(4, new Recipe(4, "Mushroom Risotto", "veg",
                                Arrays.asList("rice", "mushrooms", "onion", "garlic", "butter", "parmesan")));
                recipeBook.put(5, new Recipe(5, "Fish and Chips", "non-veg",
                                Arrays.asList("fish", "potatoes", "flour", "oil", "spices")));
        }

        // Don't modify the above code

        // Write your code here
        int uniqueId=6;

        @Override
        public ArrayList<Recipe> getRecipe(){
             Collection<Recipe> RecipeList = recipeBook.values();
             ArrayList<Recipe> Recipes = new ArrayList<>(RecipeList);
             return Recipes;
        }

        @Override
        public Recipe addRecipe(Recipe recipe){
             recipe.setRecipeId(uniqueId);
             recipeBook.put(uniqueId,recipe);
             uniqueId=uniqueId+1;
             return recipe;
        }
}
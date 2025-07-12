// Write your code here
package com.example.recipe;

import com.example.recipe.Recipe;
import java.util.*;

public interface RecipeRepository{
    ArrayList<Recipe> getRecipe();
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(int recipeId);
}

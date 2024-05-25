package com.tariqueanwar.recipeapp.Listeners;

import com.tariqueanwar.recipeapp.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);


    void didError(String message);
}

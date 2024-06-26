package com.tariqueanwar.recipeapp.Listeners;

import com.tariqueanwar.recipeapp.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> responses, String message);
    void didError(String message);
}

package com.tariqueanwar.recipeapp.Listeners;

import com.tariqueanwar.recipeapp.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}

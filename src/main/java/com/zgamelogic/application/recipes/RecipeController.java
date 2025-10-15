package com.zgamelogic.application.recipes;

import com.zgamelogic.application.recipes.database.Recipe;
import com.zgamelogic.application.recipes.database.RecipeRepository;
import com.zgamelogic.application.users.database.Chef;
import com.zgamelogic.application.users.database.ChefRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class RecipeController {
    private final RecipeRepository recipeRepository;
    private final ChefRepository chefRepository;

    @PostConstruct
    public void init() {
        Chef chef = chefRepository.findAll().get(0);
        Recipe r = new Recipe(List.of(), List.of(), List.of(), chef, "Tomato soup");
        recipeRepository.save(r);
    }
}

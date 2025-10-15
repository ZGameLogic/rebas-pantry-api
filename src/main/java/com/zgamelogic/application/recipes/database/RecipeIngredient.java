package com.zgamelogic.application.recipes.database;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "recipe_ingredients")
public class RecipeIngredient {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    private Recipe recipe;
    @ManyToOne
    private Ingredient ingredient;
    private Integer amount;
    @ManyToOne
    private UnitOfMeasure unitOfMeasure;

    public RecipeIngredient(Recipe recipe, Ingredient ingredient, Integer amount, UnitOfMeasure unitOfMeasure) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }
}

package com.zgamelogic.application.recipes.database;

import com.zgamelogic.application.users.database.Chef;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue
    private UUID id;
    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> ingredients;
    @ManyToMany
    private List<Tag> tags;
    @OneToMany(mappedBy = "recipe")
    private List<Step> steps;
    @OneToOne
    private Chef chef;
    private String name;

    public Recipe(List<RecipeIngredient> ingredients, List<Tag> tags, List<Step> steps, Chef chef, String name) {
        this.ingredients = ingredients;
        this.tags = tags;
        this.steps = steps;
        this.chef = chef;
        this.name = name;
    }
}

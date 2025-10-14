package com.zgamelogic.application.recipes.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity
public class Recipe {
    @Id
    private UUID id;
    @ManyToMany
    private List<Ingredient> ingredients;
    @OneToMany
    private List<Step> steps;
}

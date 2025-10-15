package com.zgamelogic.application.recipes.database;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "recipe_steps")
public class Step {
    @Id
    @GeneratedValue
    private UUID id;
    private String description;
    private Duration duration;
    @ManyToOne
    private Recipe recipe;

    public Step(String description, Duration duration, Recipe recipe) {
        this.description = description;
        this.duration = duration;
        this.recipe = recipe;
    }
}

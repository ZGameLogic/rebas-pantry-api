package com.zgamelogic.application.recipes.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Ingredient {
    @Id
    private UUID id;
}

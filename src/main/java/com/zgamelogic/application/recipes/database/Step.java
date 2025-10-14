package com.zgamelogic.application.recipes.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Duration;
import java.util.UUID;

@Entity
public class Step {
    @Id
    private UUID id;
    private String step;
    private Duration duration;
}

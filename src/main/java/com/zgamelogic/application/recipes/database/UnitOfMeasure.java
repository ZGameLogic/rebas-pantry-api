package com.zgamelogic.application.recipes.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class UnitOfMeasure {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public UnitOfMeasure(String name) {
        this.name = name;
    }
}

package com.zgamelogic.application.recipes.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    public Tag(String name) {
        this.name = name;
    }
}

package com.zgamelogic.application.users.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Chef {
    @Id
    @GeneratedValue
    private UUID uuid;
    private LocalDateTime joined;

    public Chef() {
        this.joined = LocalDateTime.now();
    }
}

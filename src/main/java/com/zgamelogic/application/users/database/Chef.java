package com.zgamelogic.application.users.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;


@Entity
public class Chef {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime joined;

    public Chef() {
        this.joined = LocalDateTime.now();
    }
}

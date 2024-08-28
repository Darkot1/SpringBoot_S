package com.riwi.APIRESTful.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false, length = 100)
    private String location;

    @Column(nullable = false)
    private int ability;

    public EventEntity() {
    }

    public EventEntity(UUID id, String name, LocalDate creationDate, String location, int ability) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.location = location;
        this.ability = ability;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        if (ability < 0) {
            throw new IllegalArgumentException("La capacidad no puede ser negativa");
        }
        this.ability = ability;
    }
}
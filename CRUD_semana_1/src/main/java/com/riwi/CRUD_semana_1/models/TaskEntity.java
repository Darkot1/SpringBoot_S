package com.riwi.CRUD_semana_1.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = true)
    private String description;

    @Column(nullable = false)
    private LocalDate creatioDate;

    @Column(nullable = false)
    private LocalTime creationTime;

    @Column(length = 50, nullable = false)
    private String state;

    public TaskEntity() {
    }

    public TaskEntity(Long id, String title, String description, LocalDate creatioDate, LocalTime creationTime, String state) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creatioDate = creatioDate;
        this.creationTime = creationTime;
        this.state = state;
    }

    public Long getId() {
        return    this.id;
    }

    public String getTitle() {
        return    this.title;
    }

    public String getDescription() {
        return    this.description;
    }

    public LocalDate getCreatioDate() {
        return    this.creatioDate;
    }

    public LocalTime getCreationTime() {
        return    this.creationTime;
    }

    public String getState() {
        return    this.state;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatioDate(LocalDate creatioDate) {
        this.creatioDate = creatioDate;
    }

    public void setCreationTime(LocalTime creationTime) {
        this.creationTime = creationTime;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" +    this.id +
                ", title='" +    this.title + '\'' +
                ", description='" +    this.description + '\'' +
                ", creatioDate=" +    this.creatioDate +
                ", creationTime=" +    this.creationTime +
                ", state='" +    this.state + '\'' +
                '}';
    }
}

package com.riwi.RiwiMovies.entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Time duration;
    private Integer rating;
    private Float price;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Purchase> purchaseList;

    public Movie() {
    }

    public Movie(Long id, String title, String genre, Time duration, Integer rating, Float price) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Time getDuration() {
        return duration;
    }

    public Integer getRating() {
        return rating;
    }

    public Float getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}

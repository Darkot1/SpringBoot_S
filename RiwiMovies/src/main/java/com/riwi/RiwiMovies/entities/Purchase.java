package com.riwi.RiwiMovies.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity()
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity userId;

    @Column
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movieId;

    public Purchase() {
    }

    public Purchase(Long id, UserEntity userId, Movie movieId) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public void setUserId(UserEntity userId) {
        this.userId = userId;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }
}

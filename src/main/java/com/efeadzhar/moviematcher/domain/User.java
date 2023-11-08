package com.efeadzhar.moviematcher.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String email;
    private String name;
    private SelectedMovies selectedMovies;
}
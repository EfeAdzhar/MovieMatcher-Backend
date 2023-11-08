package com.efeadzhar.moviematcher.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MovieList {
    private List<Movie> movies;
}

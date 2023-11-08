package com.efeadzhar.moviematcher.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Movie {
    private int id;
    private String name;
    private Float rating;
    private Description description;
    private List<Genre> genres;
    private String image; //@TODO (don't know how it suppose to work with images, but I'll figure it out)
}

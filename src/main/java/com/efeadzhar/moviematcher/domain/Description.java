package com.efeadzhar.moviematcher.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Description {
    private int filmId;
    private String summary;
    private String director;
    private ReleaseDate releaseDate;
    private Duration duration;
}

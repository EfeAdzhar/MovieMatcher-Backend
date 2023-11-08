package com.efeadzhar.moviematcher.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface RestControllerInterface<T> {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public boolean postRequest(@RequestBody T entity);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public T getRequest(@PathVariable int id);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean putRequest(@PathVariable int id, @RequestBody T newEntity);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteRequest(@PathVariable int id);
}

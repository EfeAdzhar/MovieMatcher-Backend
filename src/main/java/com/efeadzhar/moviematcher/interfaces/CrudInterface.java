package com.efeadzhar.moviematcher.interfaces;

import java.util.Optional;

public interface CrudInterface<T> {
    public boolean create(T entity);
    public Optional<T> read(int id);
    public boolean update(int id, T newEntity);
    public boolean delete(int id);
}

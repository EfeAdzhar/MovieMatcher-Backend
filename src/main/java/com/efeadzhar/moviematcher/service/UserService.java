package com.efeadzhar.moviematcher.service;

import com.efeadzhar.moviematcher.domain.User;
import com.efeadzhar.moviematcher.interfaces.CrudInterface;
import com.efeadzhar.moviematcher.persistance.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements CrudInterface<User> {

    private final UserRepository repository;

    @Override
    public boolean create(User entity) {
        return repository.create(entity);
    }

    @Override
    public Optional<User> read(int id) {
        return repository.read(id);
    }

    @Override
    public boolean update(int id, User newEntity) {
        return repository.update(id, newEntity);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }
}

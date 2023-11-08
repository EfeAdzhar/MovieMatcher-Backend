package com.efeadzhar.moviematcher.persistance;

import com.efeadzhar.moviematcher.domain.User;
import com.efeadzhar.moviematcher.interfaces.CrudInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Repository
@RequiredArgsConstructor
public class UserRepository implements CrudInterface<User> {
    private final Set<User> users;

    @Override
    public boolean create(User entity) {
        if(users.contains(entity)) {
            return false;
        }
        users.add(entity);
        return true;
    }

    @Override
    public Optional<User> read(int id) {
        return users.stream()
                .filter(user -> Objects.equals(user.getId(), id))
                .findFirst();
    }

    @Override
    public boolean update(int id, User newEntity) {
        for(User user : users) {
            if(Objects.equals(user.getId(), id)) {
                users.remove(user);
                users.add(newEntity);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        var userToDelete = users.stream()
                .filter(user -> Objects.equals(user.getId(), id))
                .findFirst()
                .orElseThrow();
        if(users.contains(userToDelete)) {
            users.remove(userToDelete);
            return true;
        }
        return false;
    }
}

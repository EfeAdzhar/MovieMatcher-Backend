package com.efeadzhar.moviematcher.controller;

import com.efeadzhar.moviematcher.domain.User;
import com.efeadzhar.moviematcher.interfaces.RestControllerInterface;
import com.efeadzhar.moviematcher.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController implements RestControllerInterface<User> {

    private final UserService service;


    @Override
    public boolean postRequest(User entity) {
        return service.create(entity);
    }

    @Override
    public User getRequest(int id) {
        return service.read(id).orElseThrow();
    }

    @Override
    public boolean putRequest(int id, User newEntity) {
        return service.update(id, newEntity);
    }

    @Override
    public boolean deleteRequest(int id) {
        return service.delete(id);
    }
}

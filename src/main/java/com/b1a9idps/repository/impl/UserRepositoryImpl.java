package com.b1a9idps.repository.impl;

import com.b1a9idps.entity.User;
import com.b1a9idps.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<User> findByNameOptional(String name) {
        return find("name", name).firstResultOptional();
    }
}

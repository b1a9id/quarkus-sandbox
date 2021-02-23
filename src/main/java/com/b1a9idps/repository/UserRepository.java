package com.b1a9idps.repository;

import com.b1a9idps.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.Optional;

public interface UserRepository extends PanacheRepository<User> {

    Optional<User> findByNameOptional(String name);
}

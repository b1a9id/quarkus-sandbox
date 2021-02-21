package com.b1a9idps.service.impl;

import com.b1a9idps.dto.request.UserCreateRequest;
import com.b1a9idps.dto.response.UserResponse;
import com.b1a9idps.entity.User;
import com.b1a9idps.repository.UserRepository;
import com.b1a9idps.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.ZoneOffset.UTC;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;

    @Override
    public String greeting(String name) {
        return "hello " + name;
    }

    @Override
    public List<UserResponse> list() {
        Stream<User> users = userRepository.streamAll();
        return users.map(UserResponse::from)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse get(long id) {
        Optional<User> user = userRepository.findByIdOptional(id);
        return user
                .map(UserResponse::from)
                .orElseThrow(() -> new NotFoundException("user id " + id + " not found."));
    }

    @Override
    @Transactional
    public void create(UserCreateRequest request) {
        ZonedDateTime birthday = request.birthday != null ? ZonedDateTime.of(request.birthday, LocalTime.MIN, UTC) : null;

        User user = new User();
        user.setName(request.name);
        user.setGender(request.gender);
        user.setBirthday(birthday);

        userRepository.persist(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}

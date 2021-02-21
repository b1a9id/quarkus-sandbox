package com.b1a9idps.service;

import com.b1a9idps.dto.request.UserCreateRequest;
import com.b1a9idps.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    String greeting(String name);
    List<UserResponse> list();
    UserResponse get(long id);
    void create(UserCreateRequest dto);
    void delete(long id);
}

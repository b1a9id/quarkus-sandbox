package com.b1a9idps.dto.response;

import com.b1a9idps.entity.User;
import com.b1a9idps.enums.Gender;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class UserResponse {
    public Long id;
    public String name;
    public Gender gender;
    public LocalDate birthday;
    public ZonedDateTime createdAt;
    public ZonedDateTime updatedAt;

    public static UserResponse from(User user) {
        LocalDate birthday = user.getBirthday() != null ? user.getBirthday().toLocalDate() : null;
        UserResponse response = new UserResponse();
        response.id = user.getId();
        response.name = user.getName();
        response.gender = user.getGender();
        response.birthday = birthday;
        response.createdAt = user.getCreatedAt();
        response.updatedAt = user.getUpdatedAt();
        return response;
    }
}

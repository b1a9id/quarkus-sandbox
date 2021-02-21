package com.b1a9idps.dto.request;

import com.b1a9idps.enums.Gender;

import java.time.LocalDate;

public class UserCreateRequest {
    public String name;
    public Gender gender;
    public LocalDate birthday;

    public UserCreateRequest() {}

    public UserCreateRequest(String name, Gender gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }
}

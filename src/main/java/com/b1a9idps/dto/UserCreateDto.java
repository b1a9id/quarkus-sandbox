package com.b1a9idps.dto;

import com.b1a9idps.enums.Gender;

import java.time.LocalDate;

public class UserCreateDto {
    public String name;
    public Gender gender;
    public LocalDate birthday;
}

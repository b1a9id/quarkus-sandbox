package com.b1a9idps.entity;

import com.b1a9idps.enums.Gender;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity
public class User extends PanacheEntity {
    public String name;
    public String username;
    public Gender gender;
    public ZonedDateTime birthday;
    public ZonedDateTime created_at;
    public ZonedDateTime updated_at;
}

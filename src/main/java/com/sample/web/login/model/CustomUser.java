package com.sample.web.login.model;

import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;

@Getter
public class CustomUser extends User {

    private final String userId;
    private final String userName;

    public CustomUser(String userId, String password, String userName) {
        super(userId, password, Collections.emptyList());
        this.userId = userId;
        this.userName = userName;
    }
}

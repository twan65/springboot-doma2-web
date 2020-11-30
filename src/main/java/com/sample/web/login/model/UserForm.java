package com.sample.web.login.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
    private String userId;
    private String password;
    private String userName;

    @Builder
    public UserForm(String userId, String password, String userName) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
    }
}

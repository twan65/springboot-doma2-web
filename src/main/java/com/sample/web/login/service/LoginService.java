package com.sample.web.login.service;

import com.sample.web.login.model.UserForm;
import org.springframework.stereotype.Service;

/**
 * ログインサービス
 */
@Service
public class LoginService{

    /**
     * ログイン処理を行う。
     * @param userId ID
     * @param password パスワード
     * @return
     */
    public UserForm login(String userId, String password) {

        return new UserForm();
    }

}

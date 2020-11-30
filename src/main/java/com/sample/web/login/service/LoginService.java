package com.sample.web.login.service;

import com.sample.common.dao.LoginDao;
import com.sample.common.entity.User;
import com.sample.web.login.model.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 * ログインサービス
 */
@Service
public class LoginService{

    @Autowired
    LoginDao loginDao;

    /**
     * ログイン処理を行う。
     * @param userId ID
     * @param password パスワード
     * @return
     */
    public UserForm login(String userId, String password) throws Exception {

        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(password)) {
            // TODO: 未入力エラー
            throw new Exception();
        } else {
            User user = loginDao.selectLoginUserByUserId(userId);
            if (equalsPassword(password, user.getPassword())) {
                return UserForm.builder().userId(user.getUserId()).password(user.getPassword()).userName(user.getName()).build();
            } else {
                // TODO: パスワード入力エラー
                throw new Exception();
            }
        }
    }

    private boolean equalsPassword(String inputPassword, String password) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String p = bCryptPasswordEncoder.encode(password);
        return bCryptPasswordEncoder.matches(inputPassword, p);
    }

}

package com.sample.web.login.service;

import com.sample.common.dao.LoginDao;
import com.sample.common.entity.User;
import com.sample.web.login.model.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Objects;

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
    public UserForm login(String userId, String password) {
        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(password)) {
            throw new UsernameNotFoundException("IDまたはパスワードが未入力です。");
        } else {
            User user = loginDao.selectLoginUserByUserId(userId);
            if (Objects.isNull(user)) {
                throw new UsernameNotFoundException("IDが存在しないです。もう一度入力してください。");
            }
            if (equalsPassword(password, user.getPassword())) {
                return UserForm.builder().userId(user.getUserId()).password(user.getPassword()).userName(user.getName()).build();
            } else {
                throw new UsernameNotFoundException("パスワードが間違っています。もう一度入力してください。");
            }
        }
    }

    private boolean equalsPassword(String inputPassword, String password) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String p = bCryptPasswordEncoder.encode(inputPassword);
        return bCryptPasswordEncoder.matches(inputPassword, p);
    }

}

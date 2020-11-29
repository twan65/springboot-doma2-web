package com.sample.common.config;

import com.sample.common.constant.ViewName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String LOGIN = "/login";
    private static final String TOP = "/";
    private static final String LOGOUT = "/logout";
    private static final String[] STATIC_RESOURCE_URL_PATTERN = {
            "/css/**", "/js/**", "/webjars/**"
    };

    // 静的リソースに対してはSecurity設定を適用しない
    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(STATIC_RESOURCE_URL_PATTERN);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(new String[]{LOGIN, LOGOUT, "/error"})
                .permitAll()
                .anyRequest()
                .authenticated()
                .and() // ログイン設定
                    .formLogin()
                    .loginPage(LOGIN)
                    .defaultSuccessUrl(TOP)
                    .permitAll()
                .and() // ログアウト設定
                    .logout()
                    .logoutUrl(LOGOUT)
                    .invalidateHttpSession(true); // HTTPセッションを初期化する。
    }

}

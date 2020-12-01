package com.sample.common.config;

import com.sample.common.exception.LoginException;
import com.sample.web.login.model.CustomUser;
import com.sample.web.login.model.UserForm;
import com.sample.web.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    LoginService loginService;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
    }

    /**
     * 認証処理
     * @param username
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        try {
            String password = (String) authentication.getCredentials();
            try {
                UserForm userForm = loginService.login(username, password);
                return new CustomUser(userForm.getUserId(), userForm.getPassword(), userForm.getUserName());
            } catch(LoginException ex) {
                throw new LoginException(ex.getMessage());
            }
        } catch (Exception e) {
            this.setHideUserNotFoundExceptions(false);
            throw new UsernameNotFoundException(e.getMessage(), e);
        }
    }
}

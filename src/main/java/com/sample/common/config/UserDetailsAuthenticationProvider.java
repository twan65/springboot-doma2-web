package com.sample.common.config;

import com.sample.web.login.model.CustomUser;
import com.sample.web.login.model.UserForm;
import com.sample.web.login.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    MemberService memberService;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

        try {
            String password = (String) authentication.getCredentials();
            UserForm userForm = memberService.login(username, password);
            return new CustomUser(userForm.getUserId(), userForm.getPassword(), userForm.getUserName());
        } catch (Exception e) {
            this.setHideUserNotFoundExceptions(false);
            // Exception
        }
        // TODO
        return null;
    }

}

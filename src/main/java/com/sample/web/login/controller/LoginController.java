package com.sample.web.login.controller;

import com.sample.common.constant.ViewName;
import com.sample.web.login.model.UserForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@RequiredArgsConstructor
@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return ViewName.TOP_PAGE;
    }

    @GetMapping("/login")
    public String login(@ModelAttribute UserForm userForm, Model model) {
        return ViewName.LOGIN_PAGE;
    }
}

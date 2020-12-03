package com.sample.web.login.controller;

import com.sample.common.constant.ViewNames;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(HttpSession session, Model model) {
        return ViewNames.LOGIN_PAGE;
    }
}

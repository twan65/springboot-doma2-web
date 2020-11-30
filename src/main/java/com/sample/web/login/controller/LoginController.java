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

    @GetMapping("/")
    public String home() {
        return ViewNames.TOP_PAGE;
    }

    @GetMapping("/login")
    public String login(HttpSession session, Model model) {
        if (session != null) {

        }

        return ViewNames.LOGIN_PAGE;
    }
}

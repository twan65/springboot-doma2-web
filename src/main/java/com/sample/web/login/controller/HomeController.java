package com.sample.web.login.controller;

import com.sample.common.constant.ViewName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return ViewName.TOP_PAGE;
    }
}

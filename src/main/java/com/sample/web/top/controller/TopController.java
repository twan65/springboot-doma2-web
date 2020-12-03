package com.sample.web.top.controller;

import com.sample.common.constant.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {

    @GetMapping("/top")
    public String top() {

        return ViewNames.TOP_PAGE;
    }

}

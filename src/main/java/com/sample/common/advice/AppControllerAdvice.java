package com.sample.common.advice;

import com.sample.common.constant.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class AppControllerAdvice {

    @Autowired
    public  AppControllerAdvice(){

    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        log.error("エラー発生", e);
        return ViewNames.ERROR_PAGE;
    }
}

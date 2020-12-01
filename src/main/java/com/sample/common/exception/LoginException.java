package com.sample.common.exception;

/**
 * ログイン失敗時のException
 */
public class LoginException extends Exception {

    public LoginException(String errorMessage) {
        super(errorMessage);
    }
}

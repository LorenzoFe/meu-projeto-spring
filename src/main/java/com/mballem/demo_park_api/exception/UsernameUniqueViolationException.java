package com.mballem.demo_park_api.exception;

public class UsernameUniqueViolationException extends RuntimeException {
    public UsernameUniqueViolationException(String menssage) {
        super(menssage);

    }
}

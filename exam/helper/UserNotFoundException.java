package com.exam.helper;

public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        super("User with this email not found in database !!");
    }

    public UserNotFoundException(String msg) {
        super(msg);
    }
}

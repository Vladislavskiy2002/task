package com.vladislavskiy.TaskProject.handler;

public class UserNotFoundByIdException extends RuntimeException{
    public UserNotFoundByIdException(String message) {
        super(message);
    }
}

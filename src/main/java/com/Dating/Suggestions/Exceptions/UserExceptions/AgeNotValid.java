package com.Dating.Suggestions.Exceptions.UserExceptions;

public class AgeNotValid extends RuntimeException {
    public AgeNotValid(String message) {
        super("Age is less than 18");
    }
}

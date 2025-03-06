package com.Dating.Suggestions.Exceptions.UserExceptions;

public class Missing extends RuntimeException {
    public Missing(String message) {
        super("Enter all details");
    }
}

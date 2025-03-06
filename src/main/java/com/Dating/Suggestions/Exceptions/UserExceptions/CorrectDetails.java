package com.Dating.Suggestions.Exceptions.UserExceptions;

public class CorrectDetails extends RuntimeException {
    public CorrectDetails() {
        super("Enter the correct details");
    }
}

package com.Dating.Suggestions.Exceptions.UserExceptions;

public class AgeNotValid extends RuntimeException {
    public AgeNotValid() {
        super("Age is less than 18");
    }
}

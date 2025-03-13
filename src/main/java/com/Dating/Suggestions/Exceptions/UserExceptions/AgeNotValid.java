package com.Dating.Suggestions.Exceptions.UserExceptions;

public class AgeNotValid extends RuntimeException {
    public AgeNotValid() {
        super("Enter the age greater then 18 and less than 41");
    }
}

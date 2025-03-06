package com.Dating.Suggestions.Exceptions.InterestException;

public class MinimumInterest extends RuntimeException {
    public MinimumInterest(String message) {
        super("enter more than 2 Interests");
    }
}

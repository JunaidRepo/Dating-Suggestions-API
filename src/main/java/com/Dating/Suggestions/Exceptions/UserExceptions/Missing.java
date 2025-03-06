package com.Dating.Suggestions.Exceptions.UserExceptions;

public class Missing extends RuntimeException {
    public Missing(String str) {
        super(str+" is Missing");
    }
}

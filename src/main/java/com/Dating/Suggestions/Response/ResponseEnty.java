package com.Dating.Suggestions.Response;


import java.time.LocalDateTime;

public class ResponseEnty<T> {
    private int statusCode;
    private String message;
    private T data;
    private LocalDateTime dt;

    public ResponseEnty(int statusCode, String message, T data, LocalDateTime dt) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
        this.dt = dt;
    }
}

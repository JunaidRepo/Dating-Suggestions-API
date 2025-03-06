package com.Dating.Suggestions.Response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEnty<T> {
    private int statusCode;
    private String message;
    private T data;
    private LocalDateTime dt;

}

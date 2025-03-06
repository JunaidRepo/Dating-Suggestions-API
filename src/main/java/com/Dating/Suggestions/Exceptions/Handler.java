package com.Dating.Suggestions.Exceptions;


import com.Dating.Suggestions.Exceptions.UserExceptions.AgeNotValid;
import com.Dating.Suggestions.Exceptions.UserExceptions.Missing;
import com.Dating.Suggestions.Response.ResponseEnty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class Handler {

    @ExceptionHandler
    public ResponseEntity<ResponseEnty<String>> ageException(AgeNotValid age){
        return new ResponseEntity<>(new ResponseEnty<>(400,null,age.getMessage(), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public ResponseEntity<ResponseEnty<String>> missingException(Missing miss){
        return new ResponseEntity<>(new ResponseEnty<>(400,null,miss.getMessage(), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }

}

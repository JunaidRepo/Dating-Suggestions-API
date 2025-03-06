package com.Dating.Suggestions.Exceptions;


import com.Dating.Suggestions.Exceptions.UserExceptions.AgeNotValid;
import com.Dating.Suggestions.Exceptions.UserExceptions.CorrectDetails;
import com.Dating.Suggestions.Exceptions.UserExceptions.Missing;
import com.Dating.Suggestions.Response.ResponseEnty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class Handler {

    @ExceptionHandler(AgeNotValid.class)
    public ResponseEntity<ResponseEnty<String>> ageException(AgeNotValid age){
        return new ResponseEntity<>(new ResponseEnty<>(400,"you are not Eligible",age.getMessage(), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Missing.class)
    public ResponseEntity<ResponseEnty<String>> missingException(Missing miss){
        return new ResponseEntity<>(new ResponseEnty<>(400,"enter all the Details",miss.getMessage(), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CorrectDetails.class)
    public ResponseEntity<ResponseEnty<String>> wrongDetails(CorrectDetails miss){
        return new ResponseEntity<>(new ResponseEnty<>(400,"Recheck the Entered Details",miss.getMessage(), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }



    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseEnty<String>> mainException(Exception e){
        return new ResponseEntity<>(new ResponseEnty<>(400,"Recheck All the details which you have Entered",e.getMessage(), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }

}

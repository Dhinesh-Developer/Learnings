package com.service1.Exceptions;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {
    
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleCustomException(CustomException ex){
        ErrorResponse response = new ErrorResponse(new Date(),ex.getMessage(),ex.geStatus().value());
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}

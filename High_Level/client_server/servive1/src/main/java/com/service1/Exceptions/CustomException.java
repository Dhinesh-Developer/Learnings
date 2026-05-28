package com.service1.Exceptions;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException{

    HttpStatus status;
    String message;

    CustomException(HttpStatus status,String message){
        this.status = status;
        this.message = message;
    }

    public HttpStatus geStatus(){
        return status;
    }

    @Override
    public String getMessage(){
        return message;
    }
    
}

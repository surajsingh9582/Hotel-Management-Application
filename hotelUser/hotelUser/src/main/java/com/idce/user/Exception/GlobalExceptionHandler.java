package com.idce.user.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(userNotFoundException.class)
    public ResponseEntity<ApiMessage> handleUserNotFoundException(userNotFoundException ex){
        ApiMessage apiMessage=new ApiMessage();
        apiMessage.setMessage(ex.getMessage());
        apiMessage.setStatus(false);
        return new ResponseEntity<>(apiMessage,HttpStatus.NOT_FOUND);
    }
}

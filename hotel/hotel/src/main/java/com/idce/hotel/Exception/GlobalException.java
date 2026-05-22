package com.idce.hotel.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Map<String,Object>> globalUserNotFoundException(UserNotFoundException ex){
        Map<String,Object> err=new HashMap<>();
        err.put("message : ","Hotel not found");
        err.put("Status : ","False");
        err.put("Code : ",HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}

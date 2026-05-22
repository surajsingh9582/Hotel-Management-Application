package com.idce.hotel.Exception;

public class UserNotFoundException extends RuntimeException{
    UserNotFoundException(){
        super("Hotel not found");
    }
    public UserNotFoundException(String message){
        super(message);
    }
}

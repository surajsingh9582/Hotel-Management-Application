package com.idce.user.Exception;

public class userNotFoundException extends RuntimeException{
    public userNotFoundException(){
        super("User not found exception");
    }
    public userNotFoundException(String message){
        super(message);
    }
}

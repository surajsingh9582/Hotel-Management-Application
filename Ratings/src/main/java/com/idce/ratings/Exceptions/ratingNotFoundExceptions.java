package com.idce.ratings.Exceptions;

public class ratingNotFoundExceptions extends RuntimeException{
    public ratingNotFoundExceptions(){
        super("Rating not found");
    }
    public ratingNotFoundExceptions(String message){
        super(message);
    }
}

package com.shan.Exception;


public class UserNotFoundException extends Exception {
    private String username;
    
    public UserNotFoundException() {
       
    }
    
    

    public UserNotFoundException(String username) {
        super("The user with username" + username+ "was not found");

    }
    
}
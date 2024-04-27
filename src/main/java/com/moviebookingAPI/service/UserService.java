package com.moviebookingAPI.service;

public interface UserService {
	
	
    com.moviebookingAPI.models.User login(String username, String password);
    void register(com.moviebookingAPI.models.User user);
    
    
}

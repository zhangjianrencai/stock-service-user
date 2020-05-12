package com.stock.service;


import com.stock.entity.User;

public interface UserService {

	public User findUserById(long userId) throws Exception;

    public User save(User user) throws Exception;

    public void edit(User user) throws Exception;
    
    public int activeUser(long userId) throws Exception;

}

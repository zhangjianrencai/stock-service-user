package com.stock.service;


import com.stock.entity.User;

public interface UserService {

	public User findUserById(long userId);

    public void save(User user);

    public void edit(User user);

}

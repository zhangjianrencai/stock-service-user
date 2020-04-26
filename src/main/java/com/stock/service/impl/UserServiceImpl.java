package com.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.User;
import com.stock.repository.UserRepository;
import com.stock.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
    	userRepository.save(user);
    }

    @Override
    public void edit(User user) {
    	userRepository.save(user);
    }

	@Override
	public User findUserById(long id) {
		return userRepository.findUserById(id);
	}
}



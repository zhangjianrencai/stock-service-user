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
    public User save(User user) throws Exception{
    	return userRepository.save(user);
    }

    @Override
    public void edit(User user) throws Exception{
    	userRepository.save(user);
    }

	@Override
	public User findUserById(long id) throws Exception{
		return userRepository.findUserById(id);
	}

	@Override
	public int activeUser(long userId) throws Exception{
		return userRepository.activeUser(userId);
	}
}



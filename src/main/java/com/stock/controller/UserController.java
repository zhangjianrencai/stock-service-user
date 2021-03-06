package com.stock.controller;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entity.User;
import com.stock.service.UserService;

@RestController
public class UserController {
	
    @Resource
    UserService Userservice;
	
    @RequestMapping("/api/signup")
    @Cacheable(value="user-key")
    public User getUser(@RequestParam(value="userId") String userId, @RequestParam(value="password") String password) throws Exception{
    	User user=Userservice.findUserById(Long.valueOf(userId));
        return user;
    }
    
    @RequestMapping("/api/signin")
    public void saveUser(@RequestBody User newUser) throws Exception {
    	Userservice.save(newUser);
    }
}				
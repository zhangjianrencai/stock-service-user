package com.stock.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entity.User;
import com.stock.service.UserService;

@RestController
public class UserController {
	
    @Resource
    UserService Userservice;
	
    @RequestMapping("/getBlog")
    @Cacheable(value="blog-key")
    public User getBlog() {
    	User blog=Userservice.findBlogById(Long.valueOf(123456));
    	System.out.println("get from database");
        return blog;
    }
    
    @RequestMapping("/getUsers")
    @Cacheable(value="key-Users")
    public List<User> getUsers() {
    	List<User> Users=Userservice.findAllBlogList();
    	System.out.println("get from database");
        return Users;
    }
    
    @RequestMapping("/saveUser")
    void saveBlog() {
    	User user = new User();
    	Userservice.save(user);
    }
}
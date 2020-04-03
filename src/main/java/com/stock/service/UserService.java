package com.stock.service;

import java.util.List;

import com.stock.entity.User;

public interface UserService {

    public List<User> findAllBlogList();

    public User findBlogById(long id);

    public void save(User blog);

    public void edit(User blog);

    public void delete(User blog);

}

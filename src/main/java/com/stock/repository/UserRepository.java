package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById (long id);
    
    public User save(User blog);
}
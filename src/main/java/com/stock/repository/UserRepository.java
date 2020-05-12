package com.stock.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stock.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById (long id);
    
    @Modifying
    @Transactional
    @Query(value="update user u set u.confirmed='1' where u.id=?", nativeQuery = true)
    public int activeUser(@Param("id")Long id);
} 
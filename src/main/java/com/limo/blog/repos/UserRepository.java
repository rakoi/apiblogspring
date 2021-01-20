package com.limo.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limo.blog.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUsername(String username);
}

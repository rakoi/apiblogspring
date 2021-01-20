package com.limo.blog.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.limo.blog.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {

	
}

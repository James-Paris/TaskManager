package com.hcl.taskmanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.taskmanager.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	public User findUserByUsername(String name);
}

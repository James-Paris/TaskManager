package com.hcl.taskmanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.taskmanager.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}

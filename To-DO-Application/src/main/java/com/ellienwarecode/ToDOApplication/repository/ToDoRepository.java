package com.ellienwarecode.ToDOApplication.repository;

import com.ellienwarecode.ToDOApplication.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}

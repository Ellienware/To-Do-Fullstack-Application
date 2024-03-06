package com.ellienwarecode.ToDOApplication.service;

import com.ellienwarecode.ToDOApplication.dto.ToDoDto;

import java.util.List;

public interface IService {

    ToDoDto createTask(ToDoDto toDoDto);
    ToDoDto getTask(Long id);
    List<ToDoDto> getAllTasks();
    void deleteTask(Long id);
    void deleteAllTask();
    ToDoDto editTask(ToDoDto toDoDto, Long id);


}

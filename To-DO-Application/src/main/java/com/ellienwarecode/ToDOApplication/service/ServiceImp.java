package com.ellienwarecode.ToDOApplication.service;

import com.ellienwarecode.ToDOApplication.dto.ToDoDto;
import com.ellienwarecode.ToDOApplication.entity.ToDo;
import com.ellienwarecode.ToDOApplication.mapper.ToDoMapper;
import com.ellienwarecode.ToDOApplication.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImp implements IService {
    private final ToDoRepository repository;

    public ServiceImp(ToDoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ToDoDto createTask(ToDoDto toDoDto) {
        ToDo toDo = ToDoMapper.mapToDo(toDoDto);
        ToDo saveTask = repository.save(toDo);
        return ToDoMapper.mapToToDO(saveTask);
    }

    @Override
    public ToDoDto getTask(Long id) {
        ToDo toDo = repository.findById(id).orElseThrow();
        return ToDoMapper.mapToToDO(toDo);
    }

    @Override
    public List<ToDoDto> getAllTasks() {
        List<ToDo> tasks = repository.findAll();
        return tasks.stream().map(ToDoMapper:: mapToToDO).collect(Collectors.toList());
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAllTask() {
        repository.deleteAll();
    }

    @Override
    public ToDoDto editTask(ToDoDto toDoDto, Long id) {
        return null;
    }
}

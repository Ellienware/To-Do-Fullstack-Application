package com.ellienwarecode.ToDOApplication.controller;

import com.ellienwarecode.ToDOApplication.dto.ToDoDto;
import com.ellienwarecode.ToDOApplication.service.ServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class Controller {

    private final ServiceImp serviceImp;

    public Controller(ServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }

    @PostMapping
    public ResponseEntity<ToDoDto> createTask(@RequestBody ToDoDto toDoDto){
        return new ResponseEntity<>(serviceImp.createTask(toDoDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ToDoDto> getTask(@PathVariable Long id){
        ToDoDto task = serviceImp.getTask(id);
        return ResponseEntity.ok(task);
    }
    @GetMapping
    public ResponseEntity<List<ToDoDto>> getAllTasks(){
        List<ToDoDto> tasks = serviceImp.getAllTasks();
        return ResponseEntity.ok(tasks);
    }
    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable Long id){
        serviceImp.deleteTask(id);
    }
    @DeleteMapping
    public void deleteAllTasks(){
        serviceImp.deleteAllTask();
    }

}

package com.ellienwarecode.ToDOApplication.mapper;

import com.ellienwarecode.ToDOApplication.dto.ToDoDto;
import com.ellienwarecode.ToDOApplication.entity.ToDo;

public class ToDoMapper {
    public static ToDo mapToDo(ToDoDto toDoDto){
        ToDo toDo = new ToDo(toDoDto.getId(), toDoDto.getTitle(), toDoDto.getDescription(), toDoDto.isCompleted(), toDoDto.getDueDateTime());
        return toDo;
    }

    public static ToDoDto mapToToDO(ToDo toDo){
        ToDoDto toDoDto = new ToDoDto(toDo.getId(),toDo.getTitle(),toDo.getDescription(),toDo.isCompleted(), toDo.getDueDateTime());
        return toDoDto;
    }
}

package com.ellienwarecode.ToDOApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDto {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime dueDateTime;
}

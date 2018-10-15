package com.kodilla.crud.mapper;

import com.kodilla.crud.domain.Task;
import com.kodilla.crud.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public Task mapToTask(final TaskDto taskDto) {
        return new Task();
    }
}
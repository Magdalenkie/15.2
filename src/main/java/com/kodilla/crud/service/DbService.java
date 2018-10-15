package com.kodilla.crud.service;

import com.kodilla.crud.domain.Task;
import com.kodilla.crud.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public Task getTaskById(final Long id){
        return repository.findById(id).orElse(null);
    }

    public Task saveTask(final Task task){
        return repository.save(task);
    }

}

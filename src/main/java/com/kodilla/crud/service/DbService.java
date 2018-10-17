package com.kodilla.crud.service;

import com.kodilla.crud.domain.Task;
import com.kodilla.crud.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public Optional<Task> getTask(final Long id){
        return repository.findById(id);
    }

    public Task saveTask(final Task task){
        return repository.save(task);
    }

    public void deleteTask(final Long task){
        repository.delete(task);
    }

}

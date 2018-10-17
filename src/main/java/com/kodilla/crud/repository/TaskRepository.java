package com.kodilla.crud.repository;

import com.kodilla.crud.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long>{
    @Override
    List<Task> findAll();

    @Override
    Task save (Task task);

    Optional<Task> findById(Long id);

   // void delete(Long id);
}



package com.riwi.CRUD_semana_1.services;

import com.riwi.CRUD_semana_1.models.TaskEntity;
import com.riwi.CRUD_semana_1.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<TaskEntity> findAll(){
        return taskRepository.findAll();
    }

    public Optional<TaskEntity> findById(Long id){
        return taskRepository.findById(id);
    }

    public void save(TaskEntity task){
        taskRepository.save(task);
    }

    public void deleteById(Long id){
        taskRepository.deleteById(id);
    }

}

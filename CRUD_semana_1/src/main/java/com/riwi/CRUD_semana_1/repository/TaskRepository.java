package com.riwi.CRUD_semana_1.repository;

import com.riwi.CRUD_semana_1.models.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

    List<TaskEntity> findByTitle(String title);
}

package com.riwi.CRUD_semana_1.controllers;

import com.riwi.CRUD_semana_1.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/tareas")
public class TaskController {

    @Autowired
    private TaskService taskService;



}

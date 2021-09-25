package com.raisetech.springbootdemo.Controller;

import java.util.List;

import com.raisetech.springbootdemo.Domain.Task;
import com.raisetech.springbootdemo.Service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TaskController {

    @Autowired
    TaskService service;

    // READ
    @GetMapping
    public String index(Task task, Model m) {
        List<Task> taskList = service.findAll();
        m.addAttribute("taskList", taskList);
        return "index";
    }

    // CREATE
    public String create(Task task, Model m) {
        return "index";
    }

    // UPDATE
    public void update(Model m) {

    }

    // DELETE
    public void delete(Model m) {

    }

}
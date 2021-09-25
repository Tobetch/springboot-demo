package com.raisetech.springbootdemo.Service;

import java.util.List;

import com.raisetech.springbootdemo.Domain.Task;
import com.raisetech.springbootdemo.Repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    TaskRepository repository;

    // public Task find() {
    // return repository.find();
    // }

    public List<Task> findAll() {
        return repository.findAll();
    }

}
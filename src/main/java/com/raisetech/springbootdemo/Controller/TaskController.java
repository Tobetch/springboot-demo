package com.raisetech.springbootdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TaskController {

    // READ
    @GetMapping
    public String index(Model m) {
        return "index";
    }

    // CREATE
    public void create(Model m) {

    }

    // UPDATE
    public void update(Model m) {

    }

    // DELETE
    public void delete(Model m) {

    }

}
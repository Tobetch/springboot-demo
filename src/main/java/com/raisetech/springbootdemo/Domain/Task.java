package com.raisetech.springbootdemo.Domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Task {
    private int id;

    private String name;

    private String content;

    private LocalDate deadline;

}
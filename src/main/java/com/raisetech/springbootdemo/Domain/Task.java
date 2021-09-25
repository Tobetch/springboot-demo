package com.raisetech.springbootdemo.Domain;

import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Validated
@Data
public class Task {
    private String name;

    private String content;

    private LocalDate deadline;

}
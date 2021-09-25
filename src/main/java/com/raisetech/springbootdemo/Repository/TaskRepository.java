package com.raisetech.springbootdemo.Repository;

import java.util.List;

import com.raisetech.springbootdemo.Domain.Task;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TaskRepository {

    @Select("SELECT * FROM task where id=#{id}")
    public Task find(int id);

    @Select("SELECT * FROM task")
    public List<Task> findAll();

}
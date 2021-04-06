package com.osSpring.dao;

import com.osSpring.entity.Student;

import java.util.Collection;

public interface StudentDao {
    public Collection<Student> findAll();
    public Student findById(int id);
    public void saveOrUpdate(Student student);
    public void deleteById(int id);

}

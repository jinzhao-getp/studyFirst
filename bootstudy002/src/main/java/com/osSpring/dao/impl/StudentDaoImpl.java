package com.osSpring.dao.impl;


import com.osSpring.dao.StudentDao;
import com.osSpring.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {
    private static Map<Integer,Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put(1,new Student(1,"Tom",22));
        studentMap.put(2,new Student(2,"Jerry",23));
        studentMap.put(3,new Student(3,"Speike",24));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(int id) {
        studentMap.remove(id);
    }
}

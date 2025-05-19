package com.ejemplo.services;

import com.ejemplo.entities.Student;
import com.ejemplo.repositories.StudentRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }


    public List<Student> getByNombre(String nombre) {
        return studentRepository.findByNombre(nombre);
    }
}
package com.ejemplo.controllers;

import com.ejemplo.entities.Student;
import com.ejemplo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public List<Student> all() {
        return service.getAll();
    }

    @GetMapping("/nombre")
    public List<Student> porNombre(@RequestParam String nombre) {
        return service.byNombre(nombre);
    }

    @GetMapping("/pais-native")
    public List<Student> porPaisNative(@RequestParam String pais) {
        return service.byPaisNative(pais);
    }
}

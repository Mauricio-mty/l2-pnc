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

    @GetMapping("/correo/{correo}")
    public List<Student> porCorreo(@PathVariable("correo") String correo) {
        return service.byCorreo(correo);
    }

    @GetMapping("/curso/{cursoId}")
    public List<Student> estudiantesPorCurso(@PathVariable Long cursoId) {
        return service.byCursoId(cursoId);
    }
}

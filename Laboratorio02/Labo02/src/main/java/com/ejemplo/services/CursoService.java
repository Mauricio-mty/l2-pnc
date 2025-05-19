package com.ejemplo.services;


import com.ejemplo.entities.Curso;
import com.ejemplo.repositories.CursoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }

    public List<Curso> getByNombre(String nombre) {
        return cursoRepository.findByNombre(nombre);
    }

}

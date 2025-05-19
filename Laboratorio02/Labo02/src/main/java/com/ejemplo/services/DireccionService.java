package com.ejemplo.services;


import com.ejemplo.entities.Direccion;
import com.ejemplo.repositories.DireccionRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public List<Direccion> getAll() {
        return direccionRepository.findAll();
    }

    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    public void deleteById(Long id) {
        direccionRepository.deleteById(id);
    }

    public List<Direccion> getByCiudad(String ciudad) {
        return direccionRepository.findByCiudad(ciudad);
    }

    public List<Direccion> getByPais(String pais) {
        return direccionRepository.findByPais(pais);
    }
}

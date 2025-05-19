package com.ejemplo.repositories;

import com.ejemplo.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DireccionRepository extends JpaRepository<Direccion, Long>{

    List<Direccion> findByCiudad(String ciudad);

    List<Direccion> findByPais(String pais);

}

package com.ejemplo.repositories;

import com.ejemplo.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DireccionRepository extends JpaRepository<Direccion, Long>{

    List<Direccion> findByCiudad(String ciudad);

    List<Direccion> findByPais(String pais);

    @Query(value = "SELECT * FROM direcciones WHERE calle ILIKE %:subcadena%", nativeQuery = true )
    List<Direccion> findNativeByCalleLike(@Param("subcadena") String subcadena);

}

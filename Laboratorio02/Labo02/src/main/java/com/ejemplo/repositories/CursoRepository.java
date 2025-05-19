package com.ejemplo.repositories;

import com.ejemplo.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNombre(String nombre);

    @Query(value = "SELECT * FROM cursos WHERE estudiante_id = :estId", nativeQuery = true)
    List<Curso> findNativeByEstudianteId(@Param("estId") Long estudianteId);
}

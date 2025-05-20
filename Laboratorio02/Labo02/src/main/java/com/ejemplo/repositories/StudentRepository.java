package com.ejemplo.repositories;

import com.ejemplo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{

    @Query("SELECT e FROM Student e WHERE e.correo = :correo")
    List<Student> findByCorreo(@Param("correo") String correo);

    @Query("SELECT DISTINCT s FROM Student s JOIN s.cursos c WHERE c.id = :cursoId")
    List<Student> findByCursoId(@Param("cursoId") Long cursoId);

    List<Student> findDistinctByCursos_Id(Long cursosId);
}

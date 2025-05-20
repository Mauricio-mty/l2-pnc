package com.ejemplo.repositories;

import com.ejemplo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{

    List<Student> findByNombre(String nombre);

    @Query("SELECT e FROM Student e WHERE e.correo = :correo")
    List<Student> findByCorreo(@Param("correo") String correo);
}

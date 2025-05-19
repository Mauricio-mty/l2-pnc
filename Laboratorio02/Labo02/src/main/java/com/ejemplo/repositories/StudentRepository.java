package com.ejemplo.repositories;

import com.ejemplo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{

    List<Student> findByNombre(String nombre);

    @Query(value = "SELECT * FROM estudiantes WHERE pais = :pais", nativeQuery = true)
    List<Student> findNativeByPais(@Param("pais") String pais);
}

package com.ejemplo.repositories;

import com.ejemplo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{

    List<Student> findByNombre(String nombre);

}

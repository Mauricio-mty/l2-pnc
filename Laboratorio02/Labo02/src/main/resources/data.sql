INSERT INTO direcciones (id, calle, ciudad, pais) VALUES
    (3, 'Av. Siempre Viva 742', 'Springfield', 'EEUU');

-- insertar estudiantes (ojo al FK direccion_id)
INSERT INTO estudiantes (id, nombre, correo, direccion_id) VALUES
    (2, 'Juan Pérez', 'juan@correo.com', 2);

-- insertar cursos
INSERT INTO cursos (id, nombre, descripcion, estudiante_id) VALUES
(5, 'Java Básico', 'Introducción a Java', 1),
(6, 'Spring Boot', 'Construyendo APIs REST', 1);
package com.ejemplo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "direcciones")
@Getter @Setter @NoArgsConstructor
public class Direccion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="calle")
    private String calle;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="nombre")
    private String pais;

    @OneToOne(mappedBy = "direccion", fetch = FetchType.LAZY)
    private Student estudiante;
}

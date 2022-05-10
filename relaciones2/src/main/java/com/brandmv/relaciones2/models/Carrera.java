package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "carreras")
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "codigo_carrera", length = 5, unique = true, nullable = false)
    private String codigoCarrera;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "nombre", length = 25, nullable = false)
    private String nombre;

    /**Foreign keys alumnos*/
    @OneToMany
    @JoinColumn(name = "carrera_id", referencedColumnName = "id")
    private List<Alumno> alumnos;

    @ManyToMany
    @JoinTable(
            name = "materias_carreras",
            joinColumns = @JoinColumn(name = "carrera_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id")
    )
    private List<Materia> materias;

}

package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "materias")
public class Materia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "codigo_materia", length = 10, nullable = false, unique = true)
    private String codigoMateria;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "nombre", length = 25, nullable = false, unique = true)
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "materias_profesores",
            joinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "profesor_id", referencedColumnName = "id")
    )
    private List<Profesor> profesores;

    @ManyToMany
    @JoinTable(
            name = "materias_carreras",
            joinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "carrera_id", referencedColumnName = "id")
    )
    private List<Carrera> carreras;
}

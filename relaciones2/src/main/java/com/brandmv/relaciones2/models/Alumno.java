package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "activo")
    private boolean activo;
    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;
    @Column(name = "numero_contro", length = 10, unique = true, nullable = false)
    private String numeroControl;
    @Column(name = "semestre")
    private int semestre;

    /**Foreign keys*/
    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Persona persona;

}

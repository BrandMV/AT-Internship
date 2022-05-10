package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cedula_profesional", length = 20, unique = true)
    private String cedulaProfesional;

    /**Foreign keys*/
    @OneToOne
    @JoinColumn(name = "cubiculo_id", referencedColumnName = "id")
    private Cubiculo cubiculo;

    @ManyToMany
    @JoinTable(
            name = "materias_profesores",
            joinColumns = @JoinColumn(name = "profesor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id")
    )
    private List<Materia> materias;
}

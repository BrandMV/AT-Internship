package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "personas")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "apellido_materno", length = 20, nullable = false)
    private String apellidoMaterno;
    @Column(name = "apellido_paterno", length = 20, nullable = false)
    private String apellidoPaterno;
    @Column(name = "curp", length = 18, nullable = false, unique = true)
    private String curp;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;

    /**Foreign keys dirreciones*/
    @OneToMany
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private List<Direccion> direcciones;

}

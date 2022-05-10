package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {
    @EmbeddedId
    private EmpleadoPK empleadoPK;
    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;

    /**Foreign keys profesores*/
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "empleado_numero_empleado", referencedColumnName = "codigo_empleado"),
            @JoinColumn(name = "empleado_nss", referencedColumnName = "nss"),
            @JoinColumn(name = "empleado_rfc", referencedColumnName = "rfc")
    })
    private List<Profesor> profesores;

    /**Foreign keys administrativos*/
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "empleado_numero_empleado", referencedColumnName = "codigo_empleado"),
            @JoinColumn(name = "empleado_nss", referencedColumnName = "nss"),
            @JoinColumn(name = "empleado_rfc", referencedColumnName = "rfc")
    })
    private List<Administrativo> administrativos;

    /**Foreign key de persona*/
    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Persona persona;
}

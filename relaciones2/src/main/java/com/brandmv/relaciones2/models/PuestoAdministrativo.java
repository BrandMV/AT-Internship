package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "puestos_administrativos")
public class PuestoAdministrativo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "codigo_puesto", length = 10, nullable = false, unique = true)
    private String codigoPuesto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "nombre", length = 25, nullable = false, unique = true)
    private String nombre;
}

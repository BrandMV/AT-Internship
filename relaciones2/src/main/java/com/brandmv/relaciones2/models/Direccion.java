package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "calle", nullable = false)
    private String calle;

    @Column(name = "codigo_postal", nullable = false)
    private String codigoPostal;
    @Column(name = "colonia", nullable = false)
    private String colonia;

    @Column(name = "numero", nullable = false)
    private String numero;
}

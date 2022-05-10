package com.brandmv.relaciones2.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cubiculos")
public class Cubiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "codigo_cubiculo", length = 10, unique = true)
    private String codigoCubiculo;
}

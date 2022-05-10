package com.brandmv.relaciones2.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "administrativos")
public class Administrativo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**Foreign key puesto*/
    @OneToOne
    @JoinColumn(name = "puesto_id", referencedColumnName = "id")
    private PuestoAdministrativo puestoAdministrativo;
}

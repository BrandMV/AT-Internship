package com.brandmv.relations.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="clients")
/**Por buena práctica todas las entities deben implementar serializable*/
public class Client implements Serializable {
  /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
*/
    /**Indicamos la pk compuesta*/
    @EmbeddedId
    private ClientPK clientPK;

    @Column(name = "name", length = 15, nullable = true)
    private String name;
    @Column(name = "lastName", length = 15, nullable = true)
    private String lastName;

    /**mapped by, quien mapea es la columna cliente de las direcciones o el campo que contendra las relaciones*/
    //@OneToMany(mappedBy = "client")
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "client_email", referencedColumnName = "email"),
            @JoinColumn(name = "client_rfc", referencedColumnName = "rfc")
    })
    private List<Address> addresses;

}

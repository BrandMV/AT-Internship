package com.brandmv.relations.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "client_details")
public class ClientDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /**Auto incremented*/
    private Long id;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "genre", length = 1)
    private int genre;
    @Column(name = "phone", length = 10)
    private String phone;

    /**Adding foreign key*/
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "client_email", referencedColumnName = "email"),
            @JoinColumn(name = "client_rfc", referencedColumnName = "rfc")
    })
    //@JoinColumn(name = "client_id")
    private Client client;



}

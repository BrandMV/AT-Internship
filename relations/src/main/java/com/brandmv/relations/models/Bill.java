package com.brandmv.relations.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "bills")
public class Bill implements Serializable {

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

     */

    @EmbeddedId
    private BillPK billPK;

    @Column(name = "description")
    private String description;
    @Column(name = "total")
    private BigDecimal total;

    /**Relacion con cliente*/
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "client_email", referencedColumnName = "email"),
            @JoinColumn(name = "client_rfc", referencedColumnName = "rfc")
    })
    //@JoinColumn(name = "client_id")
    private Client client;

    /**Si no uso join table crea dos tablas de union*/
    @ManyToMany
    @JoinTable(
            name = "bills_products",
            joinColumns = {
                    @JoinColumn(name = "bill_heading", referencedColumnName = "heading"),
                    @JoinColumn(name = "bill_issue_date", referencedColumnName = "issue_date"),

            },
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id")
    )
    private List<Product> products;

}

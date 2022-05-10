package com.brandmv.relations.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;

    /**Si no uso join table crea dos tablas de union*/
    @ManyToMany
    @JoinTable(
            name = "bills_products",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns ={
                @JoinColumn(name = "bill_heading", referencedColumnName = "heading"),
                @JoinColumn(name = "bill_issue_date", referencedColumnName = "issue_date"),
            }
    )
    private List<Bill> bils;
}

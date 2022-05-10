package com.brandmv.relations.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class BillPK implements Serializable {
    @Column(name = "heading")
    private String heading;
    @Column(name = "issue_date")
    private LocalDate issue_date;
}

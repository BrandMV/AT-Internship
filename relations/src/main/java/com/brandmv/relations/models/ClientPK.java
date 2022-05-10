package com.brandmv.relations.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**Para indicar que es pk compuesta*/
@Embeddable
public class ClientPK implements Serializable {

    @Column(name = "rfc", unique = true, length = 13, nullable = false)
    private String rfc;

    @Column(name = "email", unique = true, length = 25, nullable = false)
    private String email;
}

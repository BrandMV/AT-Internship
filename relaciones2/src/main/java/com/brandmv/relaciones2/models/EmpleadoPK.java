package com.brandmv.relaciones2.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmpleadoPK implements Serializable {
    @Column(name = "codigo_empleado", length = 10)
    private String codigoEmpleado;
    @Column(name = "nss", length = 11, nullable = false)
    private String nss;
    @Column(name = "rfc", length = 13, nullable = false)
    private String rfc;
}

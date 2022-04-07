package es.uma.proyecto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
class depositada_enKey implements Serializable {

    @Column(name = "cuentaPool_id")
    String cuentaPool_id;

    @Column(name = "cuentaRef_id")
    String cuentaRef_id;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}
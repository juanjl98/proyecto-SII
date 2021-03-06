package es.uma.proyecto;

import javax.persistence.*;

@Entity
public class deposita_en {

    @EmbeddedId
    depositada_enKey id;

    @ManyToOne
    @MapsId("cuentaPool_id")
    @JoinColumn(name = "cuentaPool_id")
    Pooled_Account pooled_account;

    @ManyToOne
    @MapsId("cuentaRef_id")
    @JoinColumn(name = "cuentaRef_id")
    Cuenta_Referencia cuenta_referencia;

    Double saldo;

    // standard constructors, getters, and setters
}
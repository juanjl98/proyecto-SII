package es.uma.proyecto;

import javax.persistence.*;

@Entity
@Table(name = "cuenta_pool_cuenta_referencia")
@IdClass(CuentaPoolCuentaReferenciaId.class)
public class CuentaPoolCuentaReferencia {

    @Id
    @ManyToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "id")
    private Pooled_Account cuentaPool;

    @Id
    @ManyToOne
    @JoinColumn(name = "delivery_agent_id", referencedColumnName = "id")
    private Cuenta_Referencia cuenta_referencia;

    @Column(name = "saldo")
    private int saldo;
}
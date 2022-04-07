package es.uma.proyecto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Pooled_Account extends Cuenta_fintech {

    @OneToMany(mappedBy = "pooled_account", fetch = FetchType.EAGER)
    private List<Cuenta_Referencia> cuentas_referenciasAsociadas;


    public Pooled_Account(){

    }
    //getter y settes
    public List<Cuenta_Referencia> getCuentas_referenciasAsociadas() {
        return cuentas_referenciasAsociadas;
    }

    public void setCuentas_referenciasAsociadas(List<Cuenta_Referencia> cuentas_referenciasAsociadas) {
        this.cuentas_referenciasAsociadas = cuentas_referenciasAsociadas;
    }

    public void addCuenta_referenciaAsociada(Cuenta_Referencia cuenta_referenciaAsociada) {
        if(this.cuentas_referenciasAsociadas == null) {
            this.cuentas_referenciasAsociadas = new ArrayList<>();
        }
        this.cuentas_referenciasAsociadas.add(cuenta_referenciaAsociada);
    }
}

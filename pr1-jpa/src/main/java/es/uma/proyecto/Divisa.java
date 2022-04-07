package es.uma.proyecto;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Divisa {
    @Id
    private String abreviatura;
    private String nombre;
    private String simbolo;
    private Float cambioEuro;
    
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Transaccion> transacciones;
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Cuenta_Referencia> cuentas_referidas;
    
    public Divisa() {
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Float getCambioEuro() {
        return cambioEuro;
    }

    public void setCambioEuro(Float cambioEuro) {
        this.cambioEuro = cambioEuro;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public ArrayList<Cuenta_Referencia> getCuentas_referidas() {
        return cuentas_referidas;
    }

    public void setCuentas_referidas(ArrayList<Cuenta_Referencia> cuentas_referidas) {
        this.cuentas_referidas = cuentas_referidas;
    }

}

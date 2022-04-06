package es.uma.proyecto;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cuenta {
    @Id
    private String iban;
    private String swift;

    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Transaccion> transacciones;
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Movimiento> movimientos;

    //Constructores, setters y getters
    public Cuenta(){}

    public Cuenta(String iban, String swift){
        this.iban = iban;
        this.swift = swift;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

}

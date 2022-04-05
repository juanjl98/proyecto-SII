package es.uma.proyecto;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tarjeta {
    @Id
    private int N_tarjeta;
    private String CVV;
    private Date fecha_caducidad;
    private Date fecha_emision;
    private String tipo;
    private Float limite_cajero;
    private Float lim_mes;
    private Float lim_online;
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Movimiento> movimientos;

    public Tarjeta(){
        
    }

    public int getN_tarjeta() {
        return N_tarjeta;
    }

    public void setN_tarjeta(int n_tarjeta) {
        N_tarjeta = n_tarjeta;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String cVV) {
        CVV = cVV;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getLimite_cajero() {
        return limite_cajero;
    }

    public void setLimite_cajero(Float limite_cajero) {
        this.limite_cajero = limite_cajero;
    }

    public Float getLim_mes() {
        return lim_mes;
    }

    public void setLim_mes(Float lim_mes) {
        this.lim_mes = lim_mes;
    }

    public Float getLim_online() {
        return lim_online;
    }

    public void setLim_online(Float lim_online) {
        this.lim_online = lim_online;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
}

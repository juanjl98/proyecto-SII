package es.uma.proyecto;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Cuenta_Referida{
    private String nombreBanco;
    private String sucursal;
    private String pais;
    private Float saldo;
    private Date fecha_apertura;
    private String estado;
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Depositada_en> dep_en;
    
    public Cuenta_Referida(){

    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Depositada_en> getDep_en() {
        return dep_en;
    }

    public void setDep_en(ArrayList<Depositada_en> dep_en) {
        this.dep_en = dep_en;
    }
  

}
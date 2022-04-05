package es.uma.proyecto;

import javax.persistence.Entity;

@Entity
public class Depositada_en {
    private Float saldo;

    public Depositada_en(){

    }

    public void setSaldo(Float saldo){
        this.saldo = saldo;
    }

    public Float getSaldo(){
        return this.saldo;
    }
}

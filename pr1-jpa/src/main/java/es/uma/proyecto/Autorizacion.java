package es.uma.proyecto;

import javax.persistence.Entity;

@Entity
public class Autorizacion {
    private String tipo;

    public Autorizacion(){

    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}

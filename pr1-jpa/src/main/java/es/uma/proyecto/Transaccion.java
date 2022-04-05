package es.uma.proyecto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaccion {
    @Id
    private Long id;
    private Date fechaInstruccion;
    private int cantidad;
    private Date fechaEjecucion;
    private Float comision;
    private boolean internacional;

    public Transaccion(){

    }

    public void getId(Long id){
        this.id = id;
    }

    public void getFechaEjecucion(Date fecha){
        this.fechaEjecucion = fecha;
    }

    public void getFechaInstruccion(Date fecha){
        this.fechaInstruccion = fecha;
    }

    public void getCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void getComision(Float comision){
        this.comision = comision;
    }

    public void getInternacional(boolean internacional){
        this.internacional = internacional;
    }

    /**
     * 
     *  GETTERS
     * 
     */

    
    public Long getId(){
        return this.id;
    }

    public Date getFechaEjecucion(){
        return this.fechaEjecucion;
    }

    public Date getFechaInstruccion(){
        return this.fechaInstruccion;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public Float getComision(){
        return this.comision;
    }

    public boolean getInternacional(){
        return this.internacional;
    }

    
}

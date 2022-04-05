package es.uma.proyecto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movimiento {
    @Id
    private Long id;
    private String modo_op;
    private Date fecha;
    private String concepto;
    private Float cantidad;
    
    public Movimiento() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getModo_op() {
        return modo_op;
    }
    public void setModo_op(String modo_op) {
        this.modo_op = modo_op;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public Float getCantidad() {
        return cantidad;
    }
    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    
}

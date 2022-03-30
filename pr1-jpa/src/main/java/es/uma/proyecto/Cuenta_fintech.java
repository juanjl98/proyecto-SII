package es.uma.proyecto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cuenta_fintech extends Cuenta {

    private String estado;
    private Date fecha_apertura;
    private Date fecha_cierre;
    private String clasificacion;

    //Contructores, setters y getters
    public Cuenta_fintech(){}
    public Cuenta_fintech(String estado, Date fecha_apertura, Date fecha_cierre, String classificacion) {
        this.estado = estado;
        this.fecha_apertura = fecha_apertura;
        this.fecha_cierre = fecha_cierre;
        this.clasificacion = classificacion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Date getFecha_apertura() {
        return fecha_apertura;
    }
    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }
    public Date getFecha_cierre() {
        return fecha_cierre;
    }
    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }
    public String getClssificacion() {
        return clasificacion;
    }
    public void setClasificacion(String classificacion) {
        this.clasificacion = classificacion;
    }


}

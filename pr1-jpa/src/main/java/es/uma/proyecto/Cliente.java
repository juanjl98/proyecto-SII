package es.uma.proyecto;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: Artist
 *
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;
    private String Identificacion;
    private String tipo_cliente;
    private String estado;
    private Date fecha_alta;
    private Date fecha_baja;
    private String pais;
    private String ciudad;
    private String direccion;
    private String codigo_postal;
    private boolean bloqueado = false;
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Cuenta_fintech> cuentas_fintechs;

    public Cliente() {}

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getIdentificacion(){
        return Identificacion;
    }
    public void setIdentificacion(String Identificacion){
        this.Identificacion = Identificacion;
    }
    public String getTipo_cliente(){
        return tipo_cliente;
    }
    public void setTipo_cliente(String tipo_cliente){
        this.tipo_cliente = tipo_cliente;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public Date getFecha_alta(){
        return fecha_alta;
    }
    public void setFecha_alta(Date fecha_alta){
        this.fecha_alta = fecha_alta;
    }
    public Date getFecha_baja(){
        return fecha_baja;
    }
    public void setFecha_baja(Date fecha_baja){
        this.fecha_baja = fecha_baja;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getCodigo_postal(){
        return codigo_postal;
    }
    public void setCodigo_postal(String codigo_postal){
        this.codigo_postal = codigo_postal;
    }

    public ArrayList<Cuenta_fintech> getCuentas_fintechs() {
        return cuentas_fintechs;
    }
    public void setCuentas_fintechs(ArrayList<Cuenta_fintech> cuentas_fintechs) {
        this.cuentas_fintechs = cuentas_fintechs;
    }
    //Equals y hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Identificacion == null) ? 0 : Identificacion.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (Identificacion == null) {
            if (other.Identificacion != null)
                return false;
        } else if (!Identificacion.equals(other.Identificacion))
            return false;
        return true;
    }
    //ToString
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", Identificacion=" + Identificacion + ", tipo_cliente=" + tipo_cliente + ", estado=" + estado + ", fecha_alta=" + fecha_alta + ", fecha_baja=" + fecha_baja + ", pais=" + pais + ", ciudad=" + ciudad + ", direccion=" + direccion + ", codigo_postal=" + codigo_postal + "]";
    }
}






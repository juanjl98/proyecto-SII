package es.uma.proyecto;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: Artist
 *
 */
@Entity
@DiscriminatorValue("I")
public class Individual extends Cliente {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    //Constructor
    public Individual() {
        super();
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

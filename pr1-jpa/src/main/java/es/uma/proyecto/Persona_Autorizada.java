package es.uma.proyecto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Entity implementation class for Entity: Artist
 *
 */
@Entity
public class Persona_Autorizada{

    @Id
    @GeneratedValue
    private Long id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String direccion;
    private String fecha_nacimiento;
    private String estado;
    private String fecha_inicio;
    private String fecha_fin;
    private boolean bloqueado = false;

    //Constructor
    public Persona_Autorizada() {

    }

    //Getter y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public String getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    //ToString and hashCode
    @Override
    public String toString() {
        return "Persona_Autorizada [id=" + id + ", identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", fecha_nacimiento=" + fecha_nacimiento + ", estado=" + estado + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((fecha_fin == null) ? 0 : fecha_fin.hashCode());
        result = prime * result + ((fecha_inicio == null) ? 0 : fecha_inicio.hashCode());
        result = prime * result + ((fecha_nacimiento == null) ? 0 : fecha_nacimiento.hashCode());
        result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
}

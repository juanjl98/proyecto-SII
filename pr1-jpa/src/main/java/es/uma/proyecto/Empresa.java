package es.uma.proyecto;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: Artist
 *
 */
@Entity
@DiscriminatorValue("E")
public class Empresa extends Cliente {
    private String razonSocial;
    @ManyToMany
    @JoinTable(name = "Autorizacion",
            joinColumns = @JoinColumn(name = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_autorizacion"))
    private List<Persona_Autorizada> autorizaciones;

    //Constructor
    public Empresa() {
        super();
    }

    //Getter y setter
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

}


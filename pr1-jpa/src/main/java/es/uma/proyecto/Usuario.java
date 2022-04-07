package es.uma.proyecto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//User class with username, password and email
@Entity
public class Usuario {
    @Id
    private String email;
    private String username;
    private String password;

    //One to one relationship with Cliente
    @OneToOne
    private Cliente cliente;

    //One to one relationship with Empleado
    @OneToOne
    private Persona_Autorizada persona_autorizada;

}

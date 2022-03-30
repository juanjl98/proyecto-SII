package es.uma.proyecto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {
    @Id
    private String iban;
    private String swift;

    //Constructores, setters y getters
    public Cuenta(){}

    public Cuenta(String iban, String swift){
        this.iban = iban;
        this.swift = swift;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }


}

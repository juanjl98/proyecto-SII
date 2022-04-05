package es.uma.proyecto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Segregada {
    private Float comision;
    @OneToOne(fetch = FetchType.LAZY)
    private Cuenta_Referida cRef;

    public Segregada(){

    }

    public void setComision(Float comision){
        this.comision = comision;
    }

    public Float getComision(){
        return this.comision;
    }

    public Cuenta_Referida getcRef() {
        return cRef;
    }

    public void setcRef(Cuenta_Referida cRef) {
        this.cRef = cRef;
    }

    
}

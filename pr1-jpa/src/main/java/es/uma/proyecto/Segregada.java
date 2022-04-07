package es.uma.proyecto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Segregada extends Cuenta_fintech{
    private Float comision;
    @OneToOne(fetch = FetchType.LAZY)
    private Cuenta_Referencia cRef;

    public Segregada(){

    }

    public void setComision(Float comision){
        this.comision = comision;
    }

    public Float getComision(){
        return this.comision;
    }

    public Cuenta_Referencia getcRef() {
        return cRef;
    }

    public void setcRef(Cuenta_Referencia cRef) {
        this.cRef = cRef;
    }

    
}

package es.uma.proyecto;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Pooled_Account {
    @OneToMany(fetch = FetchType.LAZY)
    private ArrayList<Depositada_en> dep_en;

    public Pooled_Account(){

    }

    public ArrayList<Depositada_en> getDep_en() {
        return dep_en;
    }

    public void setDep_en(ArrayList<Depositada_en> dep_en) {
        this.dep_en = dep_en;
    }

    
}

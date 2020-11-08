package com.spring.boot.entity.gp;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "medicaments")
public class Medicament extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medicament() {
    }




    @OneToMany(mappedBy = "medicament")
   private Set<Diagnose> diagnose;

    public Set<Diagnose> getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Set<Diagnose> diagnose) {
        this.diagnose = diagnose;
    }
}

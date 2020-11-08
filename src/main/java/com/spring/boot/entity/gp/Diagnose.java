package com.spring.boot.entity.gp;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "diagnoses")
public class Diagnose extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "comment")
    private String comment;





    @ManyToOne
    @JoinColumn(name = "medicament_id",referencedColumnName = "id")
    private Medicament medicament;

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public Diagnose() {

    }

    @OneToOne
    @JoinColumn(name = "visitation_id",referencedColumnName = "id")
    private Visitation visitation;

    public Visitation getVisitation() {
        return visitation;
    }

    public void setVisitation(Visitation visitation) {
        this.visitation = visitation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

package com.spring.boot.entity.gp;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visitations")
public class Visitation extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "comments")
    private String comment;



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



    public Visitation() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Patient.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id",referencedColumnName = "id")
    private Patient patients;

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }





    @OneToOne(mappedBy = "visitation")
    private Diagnose diagnose;

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "Visitation{" +
                "date=" + date +
                ", comment='" + comment + '\'' +
                '}';
    }
}

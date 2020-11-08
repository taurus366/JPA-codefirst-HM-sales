package com.spring.boot.entity.gp;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "picture")
    private String picture;

    @Column(name = "medical_insurance")
    private boolean medicalInsurance;



    @OneToMany(mappedBy = "patients",cascade = CascadeType.ALL,targetEntity = Visitation.class,fetch = FetchType.EAGER)
    private Set<Visitation> visitation;

    public Set<Visitation> getVisitations() {
        return visitation;
    }

    public void setVisitations(Set<Visitation> visitations) {
        this.visitation = visitations;
    }

    public Patient() {
        this.visitation = new HashSet<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(boolean medicalInsurence) {
        this.medicalInsurance = medicalInsurence;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", picture='" + picture + '\'' +
                ", medicalInsurance=" + medicalInsurance +
                '}';
    }
}

package com.spring.boot.entity.salesDatabase;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "credit_card_number")
    private String  creditCardNumber;

    @OneToMany(mappedBy = "customer",targetEntity = Sale.class)
    private Set<Sale> sales;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String email, String creditCardNumber) {
        this.name = name;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
    }

    public Set<Sale> getSales() {
        return sales;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}

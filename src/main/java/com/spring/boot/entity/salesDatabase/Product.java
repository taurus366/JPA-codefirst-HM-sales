package com.spring.boot.entity.salesDatabase;

import com.spring.boot.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "quantity")
    private double quantity;
    @Column(name = "price")
    private BigDecimal price;


    @OneToMany(mappedBy = "product",targetEntity = Sale.class)
    private Set<Sale> sales;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public Set<Sale> getSales() {
        return sales;
    }

}

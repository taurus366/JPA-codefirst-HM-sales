package com.spring.boot.entity.salesDatabase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "store_location")
public class StoreLocation extends BaseEntity{

    @Column(name = "location_name",nullable = false)
    private String locationName;

    @OneToMany(mappedBy = "storeLocation",targetEntity = Sale.class)
    private Set<Sale> sales;

    public StoreLocation() {
    }

    public StoreLocation(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Set<Sale> getSales() {
        return sales;
    }

}

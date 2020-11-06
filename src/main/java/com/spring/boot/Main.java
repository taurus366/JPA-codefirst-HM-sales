package com.spring.boot;

import com.spring.boot.entity.salesDatabase.Customer;
import com.spring.boot.entity.salesDatabase.Product;
import com.spring.boot.entity.salesDatabase.Sale;
import com.spring.boot.entity.salesDatabase.StoreLocation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("wizard_deposits");
//        EntityManager manager = emf.createEntityManager();

//        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("sales_database");
//        EntityManager manager2 = emf2.createEntityManager();

//        Product product = new Product();
//        product.setName("orange");
//        product.setQuantity(2.5);
//        product.setPrice(new BigDecimal("7.25"));
//
//        Product product2 = new Product();
//        product2.setName("banana");
//        product2.setQuantity(5.5);
//        product2.setPrice(new BigDecimal("10.25"));
//
//        StoreLocation storeLocation = new StoreLocation();
//        storeLocation.setLocationName("center");
//
//        StoreLocation storeLocation2 = new StoreLocation();
//        storeLocation2.setLocationName("home");
//
//        Customer customer = new Customer();
//        customer.setName("Ali Zinal");
//        customer.setCreditCardNumber("0894396766");
//        customer.setEmail("taurus.ali47@gmail.com");
//
//        Customer customer2 = new Customer();
//        customer2.setName("Mehmed Ali");
//        customer2.setCreditCardNumber("15746532");
//        customer2.setEmail("mehmed@abv.bg");
//
//        Sale sale = new Sale();
//        sale.setCustomer(customer);
//        sale.setProduct(product);
//        sale.setStoreLocation(storeLocation);
//        sale.setDate(new Date());
//
//        Sale sale2 = new Sale();
//        sale2.setCustomer(customer2);
//        sale2.setProduct(product2);
//        sale2.setStoreLocation(storeLocation2);
//        sale2.setDate(new Date());
//
//        Sale sale3 = new Sale();
//        sale3.setCustomer(customer);
//        sale3.setProduct(product2);
//        sale3.setStoreLocation(storeLocation);
//        sale3.setDate(new Date());
//
//        manager2.getTransaction().begin();
//        manager2.persist(product);
//        manager2.persist(product2);
//        manager2.persist(storeLocation);
//        manager2.persist(storeLocation2);
//        manager2.persist(customer);
//        manager2.persist(customer2);
//        manager2.persist(sale);
//        manager2.persist(sale2);
//        manager2.persist(sale3);
//        manager2.getTransaction().commit();
//
//
//        manager2.getTransaction().begin();
//        StoreLocation result = manager2.createQuery("SELECT s FROM StoreLocation s WHERE s.locationName = ?1", StoreLocation.class)
//                .setParameter(1, "center")
//                .getSingleResult();
//
//        manager2.createQuery("SELECT c FROM Sale c WHERE c.storeLocation.locationName = ?1",Sale.class)
//                .setParameter(1, result.getLocationName())
//                .getResultList().forEach(customer1 -> System.out.println( customer1.getProduct().getName()+" " + customer1.getCustomer().getName()));
//        manager2.getTransaction().commit();
//        manager2.close();
    }
}

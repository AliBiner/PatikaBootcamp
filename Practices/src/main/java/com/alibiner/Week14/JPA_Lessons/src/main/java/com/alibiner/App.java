package com.alibiner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.*;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

//        Customer c = new Customer();
//        c.setName("Ali");
//        c.setEmail("ali4@ali.com");
//        c.setGender(Gender.MALE);
//        c.setOnDate(LocalDateTime.now());
//
//        // Transaction for create
//        entityManager.getTransaction().begin();
//        entityManager.persist(c);
//        entityManager.getTransaction().commit();

//        scanner.nextLine();
//
//        // Select dont need a transaction
//        Customer customer = entityManager.find(Customer.class, 2);
//        System.out.println(customer);
//
//        scanner.nextLine();
//
//        //Update field
//        customer.setName("Update Ali");
//
//        //Transaction for update
//        entityManager.getTransaction().begin();
//        entityManager.merge(customer);
//        entityManager.getTransaction().commit();
//
//        scanner.nextLine();
//
//        //Transaction for delete
//        entityManager.getTransaction().begin();
//        entityManager.remove(customer);
//        entityManager.getTransaction().commit();
//
//        scanner.nextLine();


//        entityManager.getTransaction().begin();
//        Product product = new Product();
//        product.setName("Macbook M3 Air");
//        product.setPrice(BigDecimal.valueOf(40000.25));
//        product.setStock(10);
//        entityManager.persist(product);
//        entityManager.getTransaction().commit();

//        entityManager.getTransaction().begin();
//        Code code = new Code();
//        code.setGroup("11111");
//        code.setSerial("55555");
//        entityManager.persist(code);
//        entityManager.getTransaction().commit();

//        Product product = entityManager.find(Product.class, 1);
//        Code code = entityManager.find(Code.class,1);
//
//        product.setCode(code);
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(product);
//        entityManager.getTransaction().commit();


//        Supplier supplier = new Supplier();
//        supplier.setAddress("Sokak Mahalle");
//        supplier.setEmail("youtube_market@gmail.com");
//        supplier.setCompany("youtube_market");
//        supplier.setContact("555-555-5555");
//
//        Product product = entityManager.find(Product.class, 1);
//
//        transaction.begin();
//        entityManager.persist(supplier);
//
//        product.setSupplier(supplier);
//
//        transaction.commit();

//
//        Supplier supplier = entityManager.find(Supplier.class, 1);
////        Code code = entityManager.find(Code.class,1);
//
//
//        Product phone = new Product();
//
//        phone.setName("Google Pixel");
//        phone.setPrice(BigDecimal.valueOf(20_000));
//        phone.setStock(100);
//        phone.setSupplier(supplier);
////        phone.setCode(code);
//
//        transaction.begin();
//        entityManager.persist(phone);
//        transaction.commit();

        Color red = new Color();
        red.setName("Red");

        Color green = new Color();
        green.setName("Green");

        Color yellow = new Color();
        yellow.setName("Yellow");

        Color black = new Color();
        black.setName("Black");

        transaction.begin();
        entityManager.persist(red);
        entityManager.persist(green);
        entityManager.persist(yellow);
        entityManager.persist(black);

        List<Color> productColors = new ArrayList<>();
        productColors.add(red);
        productColors.add(green);
        productColors.add(yellow);


        Product googlePixel = entityManager.find(Product.class, 3);

        googlePixel.setColors(productColors);
        entityManager.merge(googlePixel);
        transaction.commit();


        System.out.println("Test");
    }
}

package com.alibiner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Customer c = new Customer();
        c.setName("Ali");
        c.setEmail("ali1@ali.com");
        c.setGender(Gender.MALE);
        c.setOnDate(LocalDateTime.now());

        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
        System.out.println("Test");
    }
}

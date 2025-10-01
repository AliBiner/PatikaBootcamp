package com.alibiner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        try( EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library_management")) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            System.out.println("Bitti");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

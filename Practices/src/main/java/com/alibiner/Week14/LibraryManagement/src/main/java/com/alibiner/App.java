package com.alibiner;

import java.util.*;
import com.alibiner.entities.Author;
import com.alibiner.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        try( EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library_management")) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();

            DateTimeFormatter birthDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");





//            Author author = new Author();
//            author.setName("Ali");
//            author.setCountry("Türkiye");
//            author.setBirthDate(LocalDate.parse("25-05-1997",birthDateFormat));
//
//            Book book = new Book();
//            book.setName("Clean Code");
//            book.setPublicationYear(LocalDate.now());
//            book.setStock(100);
//            book.setAuthor(author);
//
////            book.setAuthor(author);
//
////            Book book = entityManager.find(Book.class,4);
////
////            Author author = entityManager.find(Author.class,6);
////            author.setName("Ali Biner");
////
////            book.setAuthor(author);
//
//            transaction.begin();
//            entityManager.persist(author);
//            entityManager.persist(book);
//
//            transaction.commit();

            Book book1 = entityManager.find(Book.class, 11);
            System.out.println(book1);


            System.out.println("Bitti");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

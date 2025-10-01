package com.alibiner.entities;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;

    @Column(name = "book_name", nullable = false, length = 50)
    private String name;

    @Column(name = "book_publication_year", nullable = false)
    private LocalDate publicationYear;

    @Column(name = "book_stock", nullable = false)
    private int stock;

    @ManyToOne
    @JoinColumn(name = "product_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "product_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "product_book_borrowing_id", referencedColumnName = "borrowing_id")
    private BookBorrowing bookBorrowing;

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
}

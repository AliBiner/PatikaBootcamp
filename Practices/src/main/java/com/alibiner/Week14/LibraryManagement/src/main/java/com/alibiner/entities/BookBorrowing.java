package com.alibiner.entities;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "book_borrowing")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id")
    private long id;

    @Column(name = "borrowing_date", nullable = false, updatable = false)
    private LocalDateTime borrowDate;

    @Column(name = "return_date",nullable = false, updatable = false)
    private LocalDateTime returnDate;

    @ManyToOne
    @JoinColumn(name = "book_borrowing_user_id", referencedColumnName = "user_id")
    private User user;

    @OneToMany(mappedBy = "bookBorrowing")
    private List<Book> books;
}

package com.alibiner.entities;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "user_name",nullable = false,length = 50)
    private String name;

    @Column(name = "user_birth_date", nullable = false)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    private List<BookBorrowing> bookBorrowings;

}

package com.alibiner.entities;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "authors")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private long id;

    @Column(name = "author_name", nullable = false, length = 50)
    private String name;

    @Column(name = "author_birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "author_contry", length = 50, nullable = false)
    private String country;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

}

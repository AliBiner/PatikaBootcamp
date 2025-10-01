package com.alibiner.entities;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long id;

    @Column(name = "category_name", nullable = false, unique = true , length = 50)
    private String name;

    @Column(name = "category_description")
    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books;
}

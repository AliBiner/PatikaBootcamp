package com.alibiner.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "publishers")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private long id;

    @Column(name = "publisher_name", nullable = false, length = 50)
    private String name;

    @Column(name = "publisher_establishment_year", nullable = false)
    private LocalDate establishmentYear;

    @Column(name = "publisher_address", nullable = false)
    private String address;

    //Todo Relate Book
}

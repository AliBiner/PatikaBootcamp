package com.alibiner;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long id;

    @Column(name = "customer_name",length = 100, nullable = false)
    private String name;

    @Column(name = "customer_mail",unique = true,nullable = false)
    private String email;

    @Column(name = "customer_on_date",nullable = false,updatable = false)
    private LocalDateTime onDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "customer_gender")
    private Gender gender;


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", onDate=" + onDate +
                ", gender=" + gender +
                '}';
    }
}

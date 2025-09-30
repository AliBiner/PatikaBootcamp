package com.alibiner;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "customers")
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


    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDateTime onDate) {
        this.onDate = onDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

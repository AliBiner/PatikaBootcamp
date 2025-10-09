package com.alibiner.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
@Table(name = "refresh_token")
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refresh_token_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "refresh_token_user_id",referencedColumnName = "user_id")
    private User user;

    @Column(name = "token",unique = true,nullable = false)
    private String token;

    @Column(nullable = false)
    private Instant expiryDate;
}

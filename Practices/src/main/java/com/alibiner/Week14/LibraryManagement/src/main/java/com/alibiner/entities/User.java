package com.alibiner.entities;

import java.util.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;


    @Column(name = "user_name",nullable = false,length = 50)
    @NotNull(message = "Can not be null name of user")
    @NotBlank(message = "Can not be blank name of user")
    private String name;

    @Column(name = "user_birth_date", nullable = false)
    @NotNull(message = "Can not be null birth date")
    private LocalDate birthDate;

    @Column(name = "user_mail", unique = true, nullable = false, length = 50)
    @NotNull(message = "Can not be null email")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email")
    private String email;

    @Column(name = "user_passwd", nullable = false)
    @NotNull(message = "Can not be null email")
    @NotBlank(message = "Can not be blank password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<BookBorrowing> bookBorrowings;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bookBorrowings=" + bookBorrowings +
                '}';
    }
}

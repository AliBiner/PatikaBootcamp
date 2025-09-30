package com.alibiner;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "suppliers")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private int id;

    @Column(name = "supplier_address", nullable = false)
    private String address;

    @Column(name = "supplier_company", nullable = false)
    private String company;

    @Column(name = "supplier_mail", unique = true)
    private String email;

    @Column(name = "supplier_contact")
    private String contact;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", products=" + products +
                '}';
    }
}

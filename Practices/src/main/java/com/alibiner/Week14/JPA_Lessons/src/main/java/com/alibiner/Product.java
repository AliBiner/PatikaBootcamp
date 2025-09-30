package com.alibiner;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "products"
,indexes = @Index(name = "product_product_name_index",columnList = "product_name"))
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "product_price", precision = 16, scale = 2)
    private BigDecimal price;

    @Column(name = "product_stock")
    private int stock;

    @OneToOne
    @JoinColumn(name = "product_code_id_fk", referencedColumnName = "code_id")
    private Code code;

    @ManyToOne
    @JoinColumn(name = "product_supplier_id", referencedColumnName = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "product_category_id", referencedColumnName = "category_id")
    private Category category;

    @ManyToMany
    @JoinTable(
            name = "product_colors",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    private List<Color> colors;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", code=" + code +
                '}';
    }
}

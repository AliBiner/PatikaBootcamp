package com.alibiner;

import java.util.*;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "colors")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private int id;

    @Column(name = "color_name",nullable = false)
    private String name;

    @ManyToMany(mappedBy = "colors")
    private List<Product> products;

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

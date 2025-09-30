package com.alibiner;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "codes")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_id")
    private int id;

    @Column(name = "code_group", nullable = false)
    private String group;

    @Column(name = "code_serial", nullable = false)
    private String serial;

    @OneToOne(mappedBy = "code")
    private Product product;

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}

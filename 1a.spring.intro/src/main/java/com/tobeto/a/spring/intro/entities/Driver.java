package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="driver")
@Entity
public class Driver {
    @Id
    @Column(name = "driver_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverID;

    @Column(name="driver_name")
    private String driverName;

    @OneToMany(mappedBy = "driver") // DEĞİŞKEN İSMİ
    private List<Car> cars;
}
// one-to-many ilişkilerde list olan değişken
// @onetomany
// direkt class olan değişken @manytoone

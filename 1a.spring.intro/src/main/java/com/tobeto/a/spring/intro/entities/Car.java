package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Driver;

// ORM => Object Relation Mapping
@Table(name = "cars")
@Entity
public class Car
{
    @Id
    @Column(name = "id") // name = kolon_adı
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // classın içindeki alanın adı

    @Column(name="car_number")
    private int carNumber;

    @Column(name="car_model")
    private String carModel;

    @Column(name="rent_price")
    private BigDecimal rentPrice;

    @Column(name="car_status")
    private String carStatus;

    @Column(name="driver_id")
    private String driverId;

    // TODO: İlişkisel Brand tablosunun alanlarını eklemek.

    @ManyToOne
    @JoinColumn(name="driver_id")
    private Driver driver;
}

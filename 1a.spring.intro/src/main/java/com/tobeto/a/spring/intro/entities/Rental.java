package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

@Table(name = "rentals")
@Entity
public class Rental
{
    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rental_id;

    @Column(name = "rental_num")
    private int rental_num;

    @Column(name = "date_rent")
    private String date_rent;

    @Column(name = "time_depart")
    private String time_depart;

    @Column(name = "time_arrive")
    private String time_arrive;

    @Column(name = "destination")
    private String destination;

    @Column(name = "date_return")
    private String date_return;

    @Column(name = "payment")
    private double payment;

}


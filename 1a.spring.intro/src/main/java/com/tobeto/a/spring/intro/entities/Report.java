package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

@Table(name = "reports")
@Entity

public class Report
{
    @Id
    @Column(name = "report_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int report_id;

    @Column(name = "transaction_id")
    private int transaction_id;

    @Column(name = "rental_id")
    private int rental_id;

    @Column(name = "report_date")
    private String report_date;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;

}

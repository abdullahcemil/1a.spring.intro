package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

@Table(name = "customers")
@Entity

public class Customer
{
    @Id
    @Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admin_id;

    @Column(name = "firs_name")
    private String firs_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "contact_add")
    private String contact_add;

    @Column(name = "cust_email")
    private String cust_email;

    @Column(name = "cust_pass")
    private String cust_pass;

}

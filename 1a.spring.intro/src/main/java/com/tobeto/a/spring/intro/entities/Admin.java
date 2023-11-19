package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

@Table(name = "admin")
@Entity
public class Admin
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

    @Column(name = "admin_email")
    private String admin_email;

    @Column(name = "admin_pass")
    private String admin_pass;






}

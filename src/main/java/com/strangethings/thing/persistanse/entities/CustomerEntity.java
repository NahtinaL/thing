package com.strangethings.thing.persistanse.entities;

import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @Column(length = 11)
    @GeneratedValue
    private Integer customerNumber;

    @Column(nullable = false, length = 50)
    private String customerName;

    @Column(nullable = false, length = 50)
    private String contactLastName;

    @Column(nullable = false, length = 50)
    private String contactFirstName;

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(nullable = false, length = 50)
    private String addressLine1;

    @Column(length = 50)
    private String addressLine2;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(length = 50)
    private String state;

    @Column(length = 15)
    private String postalCode;

    @Column(nullable = false, length = 50)
    private String country;

    @ManyToOne
    @JoinColumn(name = "employeeNumber")
    @Column(length = 11)
    private EmployeeEntity salesRepEmployeeNumber;

    @Column
    private Double creditLimit;
}
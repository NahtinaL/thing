package com.strangethings.thing.persistanse.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "offices")
@NoArgsConstructor
public class OfficeEntiy {

    @Id
    @GeneratedValue
    @Column(length = 10, nullable = false)
    private Integer officeCode;

    @Column(length = 50, nullable = false)
    private String city;

    @Column(length = 50, nullable = false)
    private String phone;

    @Column(length = 50, nullable = false)
    private String addressLine1;

    @Column(length = 50)
    private String addressLine2;

    @Column(length = 50)
    private String state;

    @Column(length = 50, nullable = false)
    private String country;

    @Column(length = 15, nullable = false)
    private String postalCode;

    @Column(length = 10, nullable = false)
    private String territory;
}

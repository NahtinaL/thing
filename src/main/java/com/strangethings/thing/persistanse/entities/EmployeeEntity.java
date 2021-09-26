package com.strangethings.thing.persistanse.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NoArgsConstructor
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    @Column(length = 11)
    private Integer employeeNumber;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 10, nullable = false)
    private String extension;

    @Column(length = 100, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "officeCode")
    @Column(length = 10, nullable = false)
    private OfficeEntiy officeCode;

    @ManyToOne
    @JoinColumn(name = "employeeNumber")
    @Column(length = 11)
    private EmployeeEntity reportsTo;

    @Column(length = 50, nullable = false)
    private String jobTitle;

}
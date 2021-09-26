package com.strangethings.thing.persistanse.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue
    @Column(length = 11, nullable = false)
    private Integer orderNumber;

    @Column(nullable = false)
    private Date orderDate;

    @Column(nullable = false)
    private Date requireDate;

    @Column
    private Date shippedDate;

    @Column(nullable = false)
    private String status;

    @Column
    private String comments;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "customerNumber")
    private CustomerEntity customerNumber;
}

//        PRIMARY KEY (`orderNumber`),
//        KEY `customerNumber` (`customerNumber`),
//        CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)

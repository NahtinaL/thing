package com.strangethings.thing.persistanse.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
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

    @Column(nullable = false)
    private Integer customerNumber;
}

//        `customerNumber` int(11) NOT NULL,
//        PRIMARY KEY (`orderNumber`),
//        KEY `customerNumber` (`customerNumber`),
//        CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)

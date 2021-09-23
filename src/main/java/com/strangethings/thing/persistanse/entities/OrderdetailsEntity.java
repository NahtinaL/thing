package com.strangethings.thing.persistanse.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "orderdetails")
public class OrderdetailsEntity {

    @Id
    @Column(length = 11, nullable = false)
    private Integer orderNumber;

    @Id
    @Column(length = 15, nullable = false)
    private String productCode;

    @Column(nullable = false)
    private Integer quantityOrdered;

    @Column(nullable = false)
    private Double priceEach;

    @Column(nullable = false)
    private Integer orderLineNumber;
}


         PRIMARY KEY (`orderNumber`,`productCode`),
         KEY `productCode` (`productCode`),
         CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`orderNumber`) REFERENCES `orders` (`orderNumber`),
         CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`productCode`) REFERENCES `products` (`productCode`)
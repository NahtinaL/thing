package com.strangethings.thing.persistanse.entities;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "orderdetails")
public class OrderdetailsEntity {

    @Id
    @OneToOne
    @Column(length = 11, nullable = false)
    @JoinColumn(name = "orderNumber")
    private OrderEntity orderNumber;

    @Id
    @OneToOne
    @Column(length = 15, nullable = false)
    @JoinColumn(name = "productCode")
    private ProductEntity productCode;

    @Column(nullable = false)
    private Integer quantityOrdered;

    @Column(nullable = false)
    private Double priceEach;

    @Column(nullable = false)
    private Integer orderLineNumber;
}


//         PRIMARY KEY (`orderNumber`,`productCode`),
//         KEY `productCode` (`productCode`),
//         CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`orderNumber`) REFERENCES `orders` (`orderNumber`),
//         CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`productCode`) REFERENCES `products` (`productCode`)
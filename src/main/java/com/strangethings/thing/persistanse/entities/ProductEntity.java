package com.strangethings.thing.persistanse.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @Column(length = 15, nullable = false)
    private Integer productCode;

    @Column(length = 70, nullable = false)
    private String productName;

    @Column(length = 50, nullable = false)
    private String productLine;

    @Column(length = 10, nullable = false)
    private String productScale;

    @Column(length = 50, nullable = false)
    private String productVendor;

    @Column(nullable = false)
    private String productDescription;

    @Column(nullable = false)
    private Integer quantityInStock;

    @Column(nullable = false)
    private Double buyPrice;

    @Column(name = "MSRP", nullable = false)
    private Double msrp;
}
//        PRIMARY KEY (`productCode`),
//        KEY `productLine` (`productLine`),
//        CONSTRAINT `products_ibfk_1` FOREIGN KEY (`productLine`) REFERENCES `productlines` (`productLine`)
//

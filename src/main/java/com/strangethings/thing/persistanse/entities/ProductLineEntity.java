package com.strangethings.thing.persistanse.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productlines")
public class ProductLineEntity {

    @Id
    @Column(length = 50)
    private String productLine;

    @Column
    private String textDescription;

    @Column
    private String htmlDescription;

    @Column
    private String image; // Need to change type for storing iages
}
//`productLine` varchar(50) NOT NULL,
//        `textDescription` varchar(4000) DEFAULT NULL,
//        `htmlDescription` mediumtext,
//        `image` mediumblob,
//        PRIMARY KEY (`productLine`)
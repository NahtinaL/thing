package com.strangethings.thing.persistanse.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "payments")
public class PaymentEntity {

    @Id
    @Column
    private Integer customerNumber;

    @Column(nullable = false)
    private String checkNumber;

    @Column(nullable = false)
    private Date paymentDate;

    @Column(nullable = false)
    private Double amount;

}

//        PRIMARY KEY (`customerNumber`,`checkNumber`),
//        CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`customerNumber`) REFERENCES `customers` (`customerNumber`)
//        ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
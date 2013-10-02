package org.ninjaware.expenseware.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Ron
 * Created on 10/2/13
 *
 *  Currency definition
 */

@Entity(name="currency")
public class Currency {

    @Id
    @Column(name="CurrencyId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column(name="CurrencyCode", nullable = false)
    @Getter @Setter
    private String currencyCode;

    @Column(name="Symbol")
    @Getter @Setter
    private String symbol;

    @Column(name="Name", nullable = false)
    @Getter @Setter
    private String name;

    @Column(name="ExchangeRate", nullable = false)
    @Getter @Setter
    private double exchangeRate;

}

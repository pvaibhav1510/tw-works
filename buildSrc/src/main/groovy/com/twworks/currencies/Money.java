/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.currencies;

/**
 *
 * @author cb-vaibhav
 */
public class Money {

    public Money(Currency currency, Double value) {
        this.currency = currency;
        this.value = value;
    }

    Currency currency;
    Double value;

    public Money sum(Money m) {
        return new Money(currency, value + valInCurrentCurrency(m));
    }

    public Double valInCurrentCurrency(Money m) {
        return (m.value * m.currency.conersion()) / currency.conersion();
    }

    @Override
    public String toString() {
        return this.value + " " + currency.code();
    }

}

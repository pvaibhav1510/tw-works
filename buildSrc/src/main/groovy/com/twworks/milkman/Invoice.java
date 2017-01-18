/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.milkman;

import java.security.Timestamp;

/**
 *
 * @author cb-vaibhav
 */
public class Invoice {

    public Invoice(double amount, Timestamp date, Customer cust) {
        this.amount = amount;
        this.date = date;
        this.cust = cust;
    }

    private double amount;
    private Timestamp date;
    private Customer cust;
    private boolean paid;

    public double getAmount() {
        return amount;
    }

    public Timestamp getDate() {
        return date;
    }

    public Customer getCust() {
        return cust;
    }

    public void markAsPaid() {
        paid = true;
        
    }

    public boolean isPaid() {
        return paid;
    }

}

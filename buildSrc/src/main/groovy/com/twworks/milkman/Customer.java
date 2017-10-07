/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.milkman;

/**
 *
 * @author cb-vaibhav
 */
public class Customer {

    private String name;
    private String address;

    private double availbleFunds;

    public Customer(String name, String address, double availbleFunds) {
        this.name = name;
        this.address = address;
        this.availbleFunds = availbleFunds;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void pay(Invoice inv) {
        if (availbleFunds < inv.getAmount()) {
            throw new RuntimeException("insufficient funds");
        }
        inv.markAsPaid();
        reduceAvlFunds(inv.getAmount());
    }

    public void reduceAvlFunds(double amount) {
        availbleFunds -= amount;
    }

}

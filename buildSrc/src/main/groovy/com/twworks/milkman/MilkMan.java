/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.milkman;

import java.security.Timestamp;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cb-vaibhav
 */
public class MilkMan {

    List<Customer> customers;
    Map<Customer, List<Invoice>> customersInvoices;

    double funds;

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void collectPayments() {
        for (Customer c : customersInvoices.keySet()) {
            for (Invoice i : customersInvoices.get(c)) {
                if (!i.isPaid()) {
                    collectPayment(c, i);
                }
            }
        }
    }

    private void collectPayment(Customer cust, Invoice inv) {
        cust.pay(inv);
        increaseFund(inv.getAmount());
    }

    public void createInvoice(Customer cust, double amount, Timestamp date) {
        Invoice inv = new Invoice(amount, date, cust);
        customersInvoices.get(cust).add(inv);
    }

    public void increaseFund(double amount) {
        funds += amount;
    }

}

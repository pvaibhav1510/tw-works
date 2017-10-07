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
public class TestMain {

    public static void main(String[] args) {

        Customer c1 = new Customer("c1", "addr1", 200);
        Customer c2 = new Customer("c1", "addr1", 200);

        MilkMan mm = new MilkMan();
        mm.addCustomer(c1);
        mm.addCustomer(c2);

        mm.createInvoice(c1, 10, null);
        mm.createInvoice(c2, 20, null);

        mm.collectPayments();
    }

}

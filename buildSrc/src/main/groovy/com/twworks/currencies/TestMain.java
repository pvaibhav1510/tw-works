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
public class TestMain {

    public static void main(String[] args) {
        Money m1 = new Money(new Dollar(), 2d);
        Money m2 = new Money(new Dollar(), 3d);
        System.out.println(m1.sum(m2).toString()); // 5 dollar

        Money m3 = new Money(new Dollar(), 2d);
        Money m4 = new Money(new Rupee(), 3d);
        System.out.println(m3.sum(m4).toString()); // 2+ 1/60dollar
        System.out.println(m4.sum(m3).toString()); // 3+120 rupee

        Money m5 = new Money(new GBP(), 2d); //
        Money m6 = new Money(new Dollar(), 3d); // 
        System.out.println(m5.sum(m6).toString()); // 2 + 180/80 = GBP
        System.out.println(m6.sum(m5).toString()); // 3 + 160/60 dollar
    }

}

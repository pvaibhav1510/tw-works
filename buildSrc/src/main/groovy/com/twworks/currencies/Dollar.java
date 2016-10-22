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
public class Dollar implements Currency {

    @Override
    public String code() {
        return "USD";
    }

    @Override
    public Double conersion() {
        return 60d;
    }

}

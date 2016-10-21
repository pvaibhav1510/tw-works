/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cb-vaibhav
 */
public class Order {

    private List<LineItem> lineItems;

    public float total() {
        if (lineItems == null) {
            return 0;
        }
        float total = 0;
        for (LineItem li : lineItems) {
            total += li.itemTotal();
        }
        return total;
    }

}

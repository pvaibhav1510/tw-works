/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.models;

import com.jcraft.jsch.HASH;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cb-vaibhav
 */
public class Order {

    private Map<Product, Integer> items = new HashMap<>();
    private String orderId;

}

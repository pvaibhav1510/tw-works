/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twworks.models;

/**
 *
 * @author cb-vaibhav
 */
public class Product {

    private String name;
    private String description;
    private int measure;
    private float price;
    private String unit;

    public Product(String name, String description, int measure, float price, String unit) {
        this.name = name;
        this.description = description;
        this.measure = measure;
        this.price = price;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getMeasure() {
        return measure;
    }

    public float getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

}

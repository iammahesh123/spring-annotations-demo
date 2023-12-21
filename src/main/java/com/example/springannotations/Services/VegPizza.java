package com.example.springannotations.Services;



public class VegPizza implements Pizza {

    @Override
    public String getPizza() {
        return "veg pizza";
    }
}

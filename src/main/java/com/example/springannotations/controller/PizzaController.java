package com.example.springannotations.controller;

import com.example.springannotations.Services.Pizza;
import com.example.springannotations.Services.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController implements Pizza {
    Pizza pizza;
    @Autowired
    public  PizzaController( Pizza pizza) {
        this.pizza = pizza;

    }

    public String getPizza() {
        return pizza.getPizza();
    }
    
}

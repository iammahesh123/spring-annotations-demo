package com.example.springannotations.Config;

import com.example.springannotations.Services.NonVegPizza;
import com.example.springannotations.Services.Pizza;
import com.example.springannotations.Services.VegPizza;
import com.example.springannotations.controller.PizzaController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Pizza vegPizza() {
        return new VegPizza();
    }
    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }
    @Bean
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }
}

package com.example.cardapio.controller;

import com.example.cardapio.entity.Food;
import com.example.cardapio.service.FoodService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService service;

    @GetMapping
    public void getAll(){
        List<Food> foodList = service.getAll();
    }
}

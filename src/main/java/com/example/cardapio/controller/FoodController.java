package com.example.cardapio.controller;

import com.example.cardapio.dto.FoodRequestDto;
import com.example.cardapio.dto.FoodResponseDto;
import com.example.cardapio.entity.Food;
import com.example.cardapio.service.FoodService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDto> getAll(){
        return service.getAll();

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDto foodRequestDto){
        service.save(foodRequestDto);
    }
}

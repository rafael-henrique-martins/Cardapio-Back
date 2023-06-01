package com.example.cardapio.service;

import com.example.cardapio.dto.FoodRequestDto;
import com.example.cardapio.dto.FoodResponseDto;
import com.example.cardapio.entity.Food;

import java.util.List;

public interface FoodService {
    List<FoodResponseDto> getAll();

    void save(FoodRequestDto foodRequestDto);
}

package com.example.cardapio.service.serviceImpl;

import com.example.cardapio.dto.FoodRequestDto;
import com.example.cardapio.dto.FoodResponseDto;
import com.example.cardapio.entity.Food;
import com.example.cardapio.repository.FoodRepository;
import com.example.cardapio.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodImpl implements FoodService {
    @Autowired
    private FoodRepository repository;

    public List<FoodResponseDto> getAll() {
        return repository.findAll().stream()
                .map(FoodResponseDto::new).toList();
    }

    public void save(FoodRequestDto data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }
}

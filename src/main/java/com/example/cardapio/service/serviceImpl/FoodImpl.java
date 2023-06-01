package com.example.cardapio.service.serviceImpl;

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
    public List<Food> getAll() {
        return repository.findAll();
    }
}

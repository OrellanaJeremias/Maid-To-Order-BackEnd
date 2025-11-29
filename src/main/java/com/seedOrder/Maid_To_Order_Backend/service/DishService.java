package com.seedOrder.Maid_To_Order_Backend.service;


import com.seedOrder.Maid_To_Order_Backend.model.Dish;
import com.seedOrder.Maid_To_Order_Backend.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final DishRepository repo;

    public DishService(DishRepository repo) {
        this.repo = repo;
    }

    public List<Dish> findAll() {
        return repo.findAll();
    }

    public Dish save(Dish d) {
        return repo.save(d);
    }

    public Dish update(Long id, Dish newDish) {
        return repo.findById(id).map(d -> {
            d.setName(newDish.getName());
            d.setDescription(newDish.getDescription());
            d.setPrice(newDish.getPrice());
            d.setImageUrl(newDish.getImageUrl());
            return repo.save(d);
        }).orElseThrow();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

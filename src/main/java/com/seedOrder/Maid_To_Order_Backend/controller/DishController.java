package com.seedOrder.Maid_To_Order_Backend.controller;

import com.seedOrder.Maid_To_Order_Backend.model.Dish;
import com.seedOrder.Maid_To_Order_Backend.service.DishService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/dishes")
public class DishController {

    private final DishService service;

    public DishController(DishService service) {
        this.service = service;
    }

    @GetMapping
    public List<Dish> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Dish create(@RequestBody Dish d) {
        return service.save(d);
    }

    @PutMapping("/{id}")
    public Dish update(@PathVariable Long id, @RequestBody Dish d) {
        return service.update(id, d);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

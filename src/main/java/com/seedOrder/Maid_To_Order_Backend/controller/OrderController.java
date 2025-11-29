package com.seedOrder.Maid_To_Order_Backend.controller;

import com.seedOrder.Maid_To_Order_Backend.model.OrderEntity;
import com.seedOrder.Maid_To_Order_Backend.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderEntity create(@RequestBody OrderEntity order) {
        return service.save(order);
    }

    @GetMapping("/{id}")
    public OrderEntity getById(@PathVariable Long id) {
        return service.findById(id).orElseThrow();
    }
}

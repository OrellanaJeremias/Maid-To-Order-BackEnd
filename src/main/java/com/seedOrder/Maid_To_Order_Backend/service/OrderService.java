package com.seedOrder.Maid_To_Order_Backend.service;

import com.seedOrder.Maid_To_Order_Backend.model.OrderEntity;
import com.seedOrder.Maid_To_Order_Backend.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public OrderEntity save(OrderEntity o) {
        return repo.save(o);
    }

    public Optional<OrderEntity> findById(Long id) {
        return repo.findById(id);
    }
}

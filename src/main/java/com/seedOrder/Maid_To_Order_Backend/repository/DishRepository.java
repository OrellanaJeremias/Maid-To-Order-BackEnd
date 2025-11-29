package com.seedOrder.Maid_To_Order_Backend.repository;

import com.seedOrder.Maid_To_Order_Backend.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
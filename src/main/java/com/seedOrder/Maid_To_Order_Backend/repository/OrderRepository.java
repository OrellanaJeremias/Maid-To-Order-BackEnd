package com.seedOrder.Maid_To_Order_Backend.repository;


import com.seedOrder.Maid_To_Order_Backend.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}

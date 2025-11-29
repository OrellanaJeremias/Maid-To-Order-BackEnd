package com.seedOrder.Maid_To_Order_Backend.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double total;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Lob
    private String itemsJson;
}

package com.example.thymeleaf.model.repository;

import com.example.thymeleaf.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

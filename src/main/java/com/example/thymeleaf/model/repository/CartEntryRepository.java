package com.example.thymeleaf.model.repository;

import com.example.thymeleaf.model.entity.CartEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartEntryRepository extends JpaRepository<CartEntry, Long> {
}

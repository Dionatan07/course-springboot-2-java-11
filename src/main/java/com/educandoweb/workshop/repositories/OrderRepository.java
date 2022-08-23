package com.educandoweb.workshop.repositories;

import com.educandoweb.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

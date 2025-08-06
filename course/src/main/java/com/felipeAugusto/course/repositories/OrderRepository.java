package com.felipeAugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeAugusto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

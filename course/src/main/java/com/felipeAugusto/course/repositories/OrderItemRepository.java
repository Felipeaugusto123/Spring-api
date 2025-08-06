package com.felipeAugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeAugusto.course.entities.OrderItem;
import com.felipeAugusto.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}

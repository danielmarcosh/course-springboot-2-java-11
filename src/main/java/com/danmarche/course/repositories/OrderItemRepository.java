package com.danmarche.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danmarche.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

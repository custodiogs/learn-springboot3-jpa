package com.custodiogs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custodiogs.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

package com.custodiogs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custodiogs.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

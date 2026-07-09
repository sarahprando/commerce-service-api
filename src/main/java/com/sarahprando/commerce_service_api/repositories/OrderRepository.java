package com.sarahprando.commerce_service_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarahprando.commerce_service_api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

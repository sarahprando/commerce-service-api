package com.sarahprando.commerce_service_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarahprando.commerce_service_api.entities.OrderItem;
import com.sarahprando.commerce_service_api.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}

package com.sarahprando.commerce_service_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarahprando.commerce_service_api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

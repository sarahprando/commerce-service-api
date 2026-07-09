package com.sarahprando.commerce_service_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarahprando.commerce_service_api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

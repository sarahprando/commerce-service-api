package com.sarahprando.commerce_service_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sarahprando.commerce_service_api.entities.Product;
import com.sarahprando.commerce_service_api.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repository;

	ProductService(ProductRepository repository) {
		this.repository = repository;
	}

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}

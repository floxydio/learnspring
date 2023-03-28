package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
   // List<Product> findByNameContains(String name);

}

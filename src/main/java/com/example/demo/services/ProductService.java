package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entities.Product;
import com.example.demo.repository.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
   @Autowired
   private ProductRepo productRepo;

   public Product create(Product product) {
      return productRepo.save(product);
   }

   public Product findOne(Long id) {
      return productRepo.findById(id).get();
   }

   public Iterable<Product> findAll() {
      return productRepo.findAll();
   }

   public void removeOne(Long id) {
      productRepo.deleteById(id);
   }
   // public List<Product> findByName(String name) {
   //    return productRepo.findByNameContains(name);
   // }
}

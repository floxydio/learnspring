package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entities.Product;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

   @Autowired
   private ProductService productService;

   @PostMapping
   public Product create(@RequestBody Product product) {
      return productService.create(product);
   }

   @GetMapping()
   public Map<String, Object> findAll() {
      var data = productService.findAll();
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("status", 200);
      map.put("data", data);
      map.put("message", "Successfully get product");
      return map;
   }

}

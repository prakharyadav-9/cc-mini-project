package com.py.miniprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.py.miniprojet.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}


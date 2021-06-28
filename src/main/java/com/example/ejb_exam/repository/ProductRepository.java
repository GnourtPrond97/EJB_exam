package com.example.ejb_exam.repository;

import com.example.ejb_exam.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

package com.example.ejb_exam.service;

import com.example.ejb_exam.entity.Product;
import com.example.ejb_exam.entity.Sale;
import com.example.ejb_exam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void create(Product product){
        productRepository.save(product);
    }
    public List<Product> getList(){
        return productRepository.findAll();
    }
}

package com.example.ejb_exam.service;

import com.example.ejb_exam.entity.Product;
import com.example.ejb_exam.entity.Sale;
import com.example.ejb_exam.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    public void create(Sale sale){
        saleRepository.save(sale);
    }
    public List<Sale> getList(){
        return saleRepository.findAll();
    }
}

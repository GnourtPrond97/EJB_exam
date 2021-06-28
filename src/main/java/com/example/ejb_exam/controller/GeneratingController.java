package com.example.ejb_exam.controller;

import com.example.ejb_exam.entity.Product;
import com.example.ejb_exam.entity.Sale;
import com.example.ejb_exam.repository.ProductRepository;
import com.example.ejb_exam.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping(value = "/generate")
public class GeneratingController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SaleRepository saleRepository;
    @RequestMapping(value = "/seed",method = RequestMethod.GET)
    public boolean seed(){
        //tao product
        Product product1 = new Product("P001","Tivi"," 100 inch",Calendar.getInstance().getTimeInMillis(),10000.1);
        productRepository.save(product1);
        Product product2 = new Product("P002","Tu lanh "," 50 lit",Calendar.getInstance().getTimeInMillis(),10000.2);
        productRepository.save(product2);
        Product product3 = new Product("P003","May giat"," 10kg",Calendar.getInstance().getTimeInMillis(),10000.3);
        productRepository.save(product3);
        Product product4 = new Product("P004","Dieu hoa"," 50 m3",Calendar.getInstance().getTimeInMillis(),10000.4);
        productRepository.save(product4);

        //tao sale
        Sale sale1 = new Sale("S001","SM001","P001","Hang huy truong",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale1);
        Sale sale2 = new Sale("S002","SM002","P001","Dao Hong Luyen",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale2);

        Sale sale3 = new Sale("S003","SM001","P002","Hang huy truong",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale1);
        Sale sale4 = new Sale("S004","SM002","P002","Dao Hong Luyen",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale1);

        Sale sale5 = new Sale("S005","SM001","P003","Hang huy truong",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale5);
        Sale sale6 = new Sale("S006","SM002","P003","Dao Hong Luyen",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale6);

        Sale sale7 = new Sale("S007","SM001","P004","Hang huy truong",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale7);
        Sale sale8 = new Sale("S008","SM002","P004","Dao Hong Luyen",Calendar.getInstance().getTimeInMillis());
        saleRepository.save(sale8);

        return true;
    }
}

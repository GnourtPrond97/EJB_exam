package com.example.ejb_exam.repository;

import com.example.ejb_exam.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,String > {
}

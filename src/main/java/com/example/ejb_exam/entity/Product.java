package com.example.ejb_exam.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String ProdID;
    private String ProdName;
    private String Description;
    private long DateOfManf;
    private double Price;

    @OneToMany(mappedBy = "product",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private Set<Sale> saleSet;

    public Product(String prodID, String prodName, String description, long dateOfManf, double price) {
        ProdID = prodID;
        ProdName = prodName;
        Description = description;
        DateOfManf = dateOfManf;
        Price = price;
    }
}

package com.example.ejb_exam.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    private String SINo;
    private String SalesmanID;
//    private String ProdID;
    private String SalesmanName;
    private long DOS;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ProdID")
    private Product product;

    public Sale(String SINo, String salesmanID, String prodID, String salesmanName, long DOS) {
        this.SINo = SINo;
        SalesmanID = salesmanID;
        product = new Product();

        product.setProdID(prodID);
        SalesmanName = salesmanName;
        this.DOS = DOS;
    }
}

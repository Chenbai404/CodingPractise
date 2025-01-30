package com.example.demo.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "tb_product")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Float productPrice;

    @Column(name = "product_number")
    private Integer productNumber;

    // @Column(name = "product_type")
    // private String  productType;

    
    // Many-to-One relationship with Category
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id") // Foreign key
    private Category category;


    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id") // Foreign key
    private Brand brand;


    public Integer getProductID() {
        return productID;
    }
    public void setProductID(Integer productID) {
        this.productID = productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Float getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }
    public Integer getProductNumber() {
        return productNumber;
    }
    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }
    // public String getProductType() {
    //     return productType;
    // }
    // public void setProductType(String productType) {
    //     this.productType = productType;
    // }
    @Override
    public String toString() {
        return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
                + ", productNumber=" + productNumber + ", category=" + category + "]";
    }
    


}

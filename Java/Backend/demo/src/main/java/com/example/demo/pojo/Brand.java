package com.example.demo.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "tb_brand")
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer brandID;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "brand_description")
    private String brandDescription;


    // One-to-Many: A brand has multiple products
    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<Product> products;


    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    @Override
    public String toString() {
        return "Brand [brandID=" + brandID + ", brandName=" + brandName + ", brandDescription=" + brandDescription
                + "]";
    }

    

    

}

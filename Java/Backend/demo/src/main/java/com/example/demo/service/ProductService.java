package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Product;
import com.example.demo.repository.ProductRepository;



@Service
public class ProductService implements IProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product add(Product product) {
        
        Product productPojo = new Product();

        BeanUtils.copyProperties(product, productPojo); 

        return productRepository.save(productPojo); 
    }

    @Override
    public Product search(Integer ID) {
        Optional<Product> productOptional = productRepository.findById(ID);  

        if (productOptional.isPresent()) {
            return productOptional.get();  
        } else {
            System.out.println("Product with ID " + ID + " not found");
            return null;
        }
    }

    @Override
    public Iterable<Product> del(Integer ID) {
        
        Optional<Product> productOptional = productRepository.findById(ID); 

        if (productOptional.isPresent()) {
            productRepository.deleteById(ID);
            
            return productRepository.findAll();
        } else {
            System.out.println("Product with ID " + ID + " not found");
            return null;
        }
    }

    @Override
    public Product revise(Integer ID, Product product) {
        
        Optional<Product> productOptional = productRepository.findById(ID);  
        
        if (productOptional.isPresent()) {
            Product productPojo = productOptional.get();  
            
        
            productPojo.setProductName(product.getProductName());
            productPojo.setProductNumber(product.getProductNumber());
            productPojo.setProductPrice(product.getProductPrice());
    
            return productRepository.save(productPojo);  
        } else {
            System.out.println("Product with ID " + ID + " not found");
            return null;
        }    
    }


}

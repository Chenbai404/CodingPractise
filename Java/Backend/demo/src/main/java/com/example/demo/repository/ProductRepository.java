package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Product;

@Repository 
public interface ProductRepository extends CrudRepository<Product, Integer>{
}

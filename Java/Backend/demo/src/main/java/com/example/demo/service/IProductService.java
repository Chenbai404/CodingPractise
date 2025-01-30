package com.example.demo.service;

import com.example.demo.pojo.Product;


public interface IProductService {

    Product add(Product product);

    Product search(Integer ID);

    Iterable<Product> del(Integer ID);

    Product revise(Integer ID, Product product);

}

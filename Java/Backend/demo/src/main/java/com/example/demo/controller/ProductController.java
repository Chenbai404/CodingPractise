package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Product;
import com.example.demo.pojo.ResponseMessage;
import com.example.demo.service.IProductService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController // 接口方法返回对象 且该对象回转换成json文本
@RequestMapping("/product") // localhost:8088/product/** */
public class ProductController {

    @Autowired
    IProductService productService;

    // 增加
    @PostMapping("/add")   // URL: localhost:8088/product/add
    public ResponseMessage<Product> add(@Valid @RequestBody Product product){

        Product productNew = productService.add(product);

        return ResponseMessage.success(productNew);

    }

    // 查询
    @GetMapping("/search")
    public ResponseMessage<Product> search(Integer ID){
        Product productNew = productService.search(ID);

        return ResponseMessage.success(productNew);
    }

    // 修改
    @PutMapping("/revise")
    public ResponseMessage<Product> revise(Integer ID, @RequestBody Product product){
        
        Product productNew = productService.revise(ID, product);

        return ResponseMessage.success(productNew);
    }

    // 删除用户
    @DeleteMapping("/del")
    public ResponseMessage<Iterable<Product>> del(Integer ID){
        Iterable<Product> remainingProduct = productService.del(ID);

        return ResponseMessage.success(remainingProduct);
    }

}

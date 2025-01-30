package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Brand;

@Repository 
public interface BrandRepository extends CrudRepository<Brand, Integer>{
}

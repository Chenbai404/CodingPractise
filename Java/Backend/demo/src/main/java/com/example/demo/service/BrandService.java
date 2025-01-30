package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Brand;
import com.example.demo.repository.BrandRepository;


@Service
public class BrandService implements IBrandService{

    @Autowired
    BrandRepository brandRepository;  

    @Override
    public Brand brandAdd(Brand brand) {
        Brand brandPojo = new Brand();
        BeanUtils.copyProperties(brand, brandPojo); 
        return brandRepository.save(brandPojo); 
    }

    @Override
    public Brand brandSearch(Integer ID) {
        Optional<Brand> brandOptional = brandRepository.findById(ID); 

        if (brandOptional.isPresent()) {
            return brandOptional.get(); 
        } else {
            System.out.println("Brand with ID " + ID + " not found");
            return null; 
        }
    }

    @Override
    public Iterable<Brand> brandDel(Integer ID) {
        Optional<Brand> brandOptional = brandRepository.findById(ID);

        if (brandOptional.isPresent()) {
            brandRepository.deleteById(ID); 
            return brandRepository.findAll(); 
        } else {
            System.out.println("Brand with ID " + ID + " not found");
            return null;
        }
    }

    @Override
    public Brand brandRevise(Integer ID, Brand brand) {
        Optional<Brand> brandOptional = brandRepository.findById(ID);

        if (brandOptional.isPresent()) {
            Brand brandPojo = brandOptional.get();

            brandPojo.setBrandName(brand.getBrandName());
            brandPojo.setBrandDescription(brand.getBrandDescription());

            return brandRepository.save(brandPojo); // 保存更新后的品牌
        } else {
            System.out.println("Brand with ID " + ID + " not found");
            return null;
        }
    }
    

}

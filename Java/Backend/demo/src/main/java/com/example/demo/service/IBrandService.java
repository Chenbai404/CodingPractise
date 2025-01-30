package com.example.demo.service;

import com.example.demo.pojo.Brand;


public interface IBrandService {

    Brand brandAdd(Brand brand);

    Brand brandSearch(Integer ID);

    Iterable<Brand> brandDel(Integer ID);

    Brand brandRevise(Integer ID, Brand brand);

}

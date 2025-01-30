package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Brand;
import com.example.demo.pojo.Category;
import com.example.demo.pojo.ResponseMessage;
import com.example.demo.service.IBrandService;
import com.example.demo.service.ICategoryService;

import jakarta.validation.Valid;

@RestController // 接口方法返回对象 且该对象回转换成json文本
@RequestMapping("/categoryAndbrand") // localhost:8088/product/** */

public class CategoryBrandController {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IBrandService brandService;


    // 添加分类
    @PostMapping("/category/add")
    public ResponseMessage<Category> addCategory(@Valid @RequestBody Category category) {
        Category newCategory = categoryService.categoryAdd(category);
        return ResponseMessage.success(newCategory);
    }

    // 查询分类
    @GetMapping("/category/search")
    public ResponseMessage<Category> searchCategory(@RequestParam Integer ID) {
        Category category = categoryService.categorySearch(ID);
        return ResponseMessage.success(category);
    }

    // 修改分类
    @PutMapping("/category/revise")
    public ResponseMessage<Category> reviseCategory(@RequestParam Integer ID, @RequestBody Category category) {
        Category updatedCategory = categoryService.categoryRevise(ID, category);
        return ResponseMessage.success(updatedCategory);
    }

    // 删除分类
    @DeleteMapping("/category/del")
    public ResponseMessage<Iterable<Category>> deleteCategory(@RequestParam Integer ID) {
        Iterable<Category> remainingCategories = categoryService.categoryDel(ID);
        return ResponseMessage.success(remainingCategories);
    }


    // ======================== Brand 增删改查 ========================

    // 添加品牌
    @PostMapping("/brand/add")
    public ResponseMessage<Brand> addBrand(@Valid @RequestBody Brand brand) {
        Brand newBrand = brandService.brandAdd(brand);
        return ResponseMessage.success(newBrand);
    }

    // 查询品牌
    @GetMapping("/brand/search")
    public ResponseMessage<Brand> searchBrand(@RequestParam Integer ID) {
        Brand brand = brandService.brandSearch(ID);
        return ResponseMessage.success(brand);
    }

    // 修改品牌
    @PutMapping("/brand/revise")
    public ResponseMessage<Brand> reviseBrand(@RequestParam Integer ID, @RequestBody Brand brand) {
        Brand updatedBrand = brandService.brandRevise(ID, brand);
        return ResponseMessage.success(updatedBrand);
    }

    // 删除品牌
    @DeleteMapping("/brand/del")
    public ResponseMessage<Iterable<Brand>> deleteBrand(@RequestParam Integer ID) {
        Iterable<Brand> remainingBrands = brandService.brandDel(ID);
        return ResponseMessage.success(remainingBrands);
    }




}

package com.example.demo.service;

import com.example.demo.pojo.Category;

public interface ICategoryService {
    Category categoryAdd(Category category);

    Category categorySearch(Integer ID);

    Iterable<Category> categoryDel(Integer ID);

    Category categoryRevise(Integer ID, Category category);
}

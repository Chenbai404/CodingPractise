package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService implements ICategoryService{

    @Autowired
    CategoryRepository categoryRepository; 

    @Override
    public Category categoryAdd(Category category) {
        
        return categoryRepository.save(category); // Save the Category to the repository
    }

    @Override
    public Category categorySearch(Integer ID) {
        Optional<Category> categoryOptional = categoryRepository.findById(ID); // Search Category by ID

        if (categoryOptional.isPresent()) {
            return categoryOptional.get(); // Return the found Category
        } else {
            System.out.println("Category with ID " + ID + " not found");
            return null; // Return null if not found
        }
    }

    @Override
    public Iterable<Category> categoryDel(Integer ID) {
        
        Optional<Category> categoryOptional = categoryRepository.findById(ID); // Search Category by ID

        if (categoryOptional.isPresent()) {
            categoryRepository.deleteById(ID); // Delete the Category if found
            
            return categoryRepository.findAll(); // Return all remaining Categories
        } else {
            System.out.println("Category with ID " + ID + " not found");
            return null; // Return null if not found
        }
    }

    @Override
    public Category categoryRevise(Integer ID, Category category) {
        
        Optional<Category> categoryOptional = categoryRepository.findById(ID); // Search Category by ID
        
        if (categoryOptional.isPresent()) {
            Category categoryPojo = categoryOptional.get();  // Get the existing Category
            
            // Update the fields
            categoryPojo.setCategoryName(category.getCategoryName());
            
            return categoryRepository.save(categoryPojo); // Save the updated Category
        } else {
            System.out.println("Category with ID " + ID + " not found");
            return null; // Return null if not found
        }    
    }
}

package com.ampliyou.javaecommerce.services;

import com.ampliyou.javaecommerce.domain.Category;
import com.ampliyou.javaecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category find(Integer id) {

        Optional<Category> resultObject = repository.findById(id);
          return  resultObject.orElse(null);
    }

}

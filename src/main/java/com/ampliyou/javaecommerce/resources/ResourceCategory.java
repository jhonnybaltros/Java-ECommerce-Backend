package com.ampliyou.javaecommerce.resources;

import com.ampliyou.javaecommerce.domain.Category;
import com.ampliyou.javaecommerce.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class ResourceCategory {

    @Autowired
    private CategoryService service;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Category responseObj = service.find(id);
        return ResponseEntity.ok().body(responseObj);
    }
}

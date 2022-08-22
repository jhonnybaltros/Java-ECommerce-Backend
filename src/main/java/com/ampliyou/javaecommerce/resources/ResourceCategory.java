package com.ampliyou.javaecommerce.resources;

import com.ampliyou.javaecommerce.domain.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class ResourceCategory {
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> listCategories() {
        Category techProducts = new Category(1, "IT Products");
        Category officeFurniture = new Category(1, "Office");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(techProducts);
        categoryList.add(officeFurniture);

        return categoryList;
    }
}

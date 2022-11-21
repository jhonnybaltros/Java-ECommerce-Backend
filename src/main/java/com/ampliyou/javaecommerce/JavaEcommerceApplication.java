package com.ampliyou.javaecommerce;

import com.ampliyou.javaecommerce.domain.Category;
import com.ampliyou.javaecommerce.domain.Product;
import com.ampliyou.javaecommerce.repositories.CategoryRepository;
import com.ampliyou.javaecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JavaEcommerceApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaEcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category itProducts = new Category(null, "IT products");
		Category office = new Category(null, "Office");

		Product computer = new Product(null, "computer", 2000.00);
		Product ps5 = new Product(null, "Playstation5", 5000.00);
		Product xboxSeriesS = new Product(null, "xboxSeriesS", 2000.00);

		itProducts.getProducts().addAll(Arrays.asList(computer, ps5, xboxSeriesS));
		office.getProducts().add(computer);

		computer.getCategories().addAll(Arrays.asList(itProducts, office));
		ps5.getCategories().add(itProducts);
		xboxSeriesS.getCategories().add(office);

		categoryRepository.saveAll(Arrays.asList(itProducts, office));
		productRepository.saveAll(Arrays.asList(computer, ps5, xboxSeriesS));
	}
}

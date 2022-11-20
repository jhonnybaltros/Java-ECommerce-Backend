package com.ampliyou.javaecommerce;

import com.ampliyou.javaecommerce.domain.Category;
import com.ampliyou.javaecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JavaEcommerceApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaEcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category itProducts = new Category(null, "IT products");
		Category office = new Category(null, "Office");

		categoryRepository.saveAll(Arrays.asList(itProducts, office));
	}
}

package com.example.mysql_crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService servie;
	
	@GetMapping("/products")
	public List<Product> list(){
		return servie.listAll();
	}
	
	@PostMapping("/products")
	public List<Product> save(@RequestBody Product product){
		servie.save(product);
		return servie.listAll();
	}
}

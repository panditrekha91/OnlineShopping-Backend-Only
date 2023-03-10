package com.Aspire.OnlineShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.OnlineShopping.Entity.Product;
import com.Aspire.OnlineShopping.repository.ProductInterface;

@RestController
public class ProductController {

	@Autowired
private	ProductInterface pro;

	@PostMapping("product add")
	public String productAdd(@RequestBody Product p)
	{
		pro.save(p);
	return "Product add sucussfully";
	
	}
	
	@GetMapping("/getproduct")
	public List<Product> getAllProduct()
	{
		return pro.findAll();
		
		
	}
}

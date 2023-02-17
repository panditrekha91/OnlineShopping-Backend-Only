package com.Aspire.OnlineShopping.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.OnlineShopping.Entity.Customer;

import com.Aspire.OnlineShopping.dto.OrderRequest;
import com.Aspire.OnlineShopping.repository.CustomInterface;

import com.Aspire.OnlineShopping.repository.ProductInterface;

@RestController
public class OrderDetailController {

	@Autowired
	private CustomInterface or;
	
	@Autowired
	private ProductInterface prod ;
	
	@PostMapping("/orderplace")
	public Customer placeOrder(@Valid @RequestBody OrderRequest o)
	{
		
		return or.save(o.getCustomer());
		
	}
	
	@GetMapping("/getor")
	public List<Customer> getOrder()
	{
		return or.findAll();
		
	}
	
}

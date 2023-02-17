package com.Aspire.OnlineShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Aspire.OnlineShopping.Entity.Customer;
import com.Aspire.OnlineShopping.repository.CustomInterface;

@RestController
public class CustomerController {

	@Autowired
	private CustomInterface obj;
	
	@PostMapping("/addcust")
	public String Customeradd(@RequestBody Customer c)
	{
		obj.save(c);
		return "customer add successfully";
		
	}
	
	@GetMapping("/getcust")
	public List<Customer> getAllCust()
	{
		return obj.findAll();
		
		
	}
	
}

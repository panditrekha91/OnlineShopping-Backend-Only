package com.Aspire.OnlineShopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aspire.OnlineShopping.Entity.Customer;

@Repository
public interface CustomInterface extends JpaRepository<Customer, Integer> {

	
	
	
}

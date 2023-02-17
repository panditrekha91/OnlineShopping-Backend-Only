package com.Aspire.OnlineShopping.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Customer{
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cust_id;
	
	@NotBlank
	@Pattern(regexp ="[A-Za-z+_ ]*", message = "Invalid Name, Name must contains only char")
	private String cust_name;
	

	@Email(message="Enter correct mail id")
	private String email;
	

	@Pattern(regexp ="[0-9]*", message = "Invalid mobile, mobile number must contains only digit")
	private String mobno;
	

	private LocalDate reg_date;
	

	private String shoppingAdd;
	

	
	 @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="productid",referencedColumnName = "cust_id")
	private List<Product> products;


	 
	 
	 
	 
	 
	 
	 

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", email=" + email + ", mobno=" + mobno
				+ ", reg_date=" + reg_date + ", shoppingAdd=" + shoppingAdd + ", products=" + products + "]";
	}



	public Customer() {
		super();
	}



	public Customer(int cust_id,
			@NotBlank @Pattern(regexp = "[A-Za-z+_ ]*", message = "Invalid Name, Name must contains only char") String cust_name,
			@Email(message = "Enter correct mail id") String email,
			@Pattern(regexp = "[0-9]*", message = "Invalid mobile, mobile number must contains only digit") String mobno,
			LocalDate reg_date, String shoppingAdd, List<Product> products) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.email = email;
		this.mobno = mobno;
		this.reg_date = reg_date;
		this.shoppingAdd = shoppingAdd;
		this.products = products;
	}



	public int getCust_id() {
		return cust_id;
	}



	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}



	public String getCust_name() {
		return cust_name;
	}



	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobno() {
		return mobno;
	}



	public void setMobno(String mobno) {
		this.mobno = mobno;
	}



	public LocalDate getReg_date() {
		return reg_date;
	}



	public void setReg_date(LocalDate reg_date) {
		this.reg_date = reg_date;
	}



	public String getShoppingAdd() {
		return shoppingAdd;
	}



	public void setShoppingAdd(String shoppingAdd) {
		this.shoppingAdd = shoppingAdd;
	}



	public List<Product> getProducts() {
		return products;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	} 


	

	 
	 
	
	
	
	
	
	
}

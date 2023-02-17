package com.Aspire.OnlineShopping.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Product {

	@Id
	private int prod_id;
	
	@NotBlank
	@Pattern(regexp = "[A-Za-z+_ ]*", message = "Invalid Name, Name must contains only char")
	private String productname;
	
	
	private double price;
	
	@NotBlank
	private String imagename;
	
	
	private boolean isactive;
	
	
	public Product() {
		super();
	}
	public Product(int prod_id, String productname, double price, String imagename, boolean isactive) {
		super();
		this.prod_id = prod_id;
		this.productname = productname;
		this.price = price;
		this.imagename = imagename;
		this.isactive = isactive;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	
	
	
	
	
	
	
}

package com.hostel.springdemo.modelO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Omodel {
	@Id
	private int id;
	private String customername;
	private String productname;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
	
package com.thoughtworks.market.sale;

public class Good {

	private String code;
	private String name;
	private float price;
	
	
	
	public Good(String code, String name, float price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}

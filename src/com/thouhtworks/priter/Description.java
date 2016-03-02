package com.thouhtworks.priter;

import com.thoughtworks.market.sale.Good;

public class Description {
	
	//结算的描述
	private String name;
	private String num;
	private float price;
	private float sum;
	private float save;
	
	public Description(Good good) {
		this.name = good.getName();
		this.price = good.getPrice();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	public float getSave() {
		return save;
	}
	public void setSave(float save) {
		this.save = save;
	}
}

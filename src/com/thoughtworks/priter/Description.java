package com.thoughtworks.priter;

import com.thoughtworks.market.sale.Good;

public class Description {
	
	//结算的描述
	private String name;
	private int num;
	private double price;
	private double sum;
	private double save;
	
	public Description(Good good) {
		this.name = good.getName();
		this.price = good.getPrice();
	}
	public Description() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getSave() {
		return save;
	}
	public void setSave(double save) {
		this.save = save;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("名称:"+this.getName()+"\t 数量:"+this.getNum()+"\t 单价:"+this.price+
				"\t 小计:"+this.sum);
		if(this.save != 0){
			sb.append("\t 节省:");
			sb.append(this.save);
		}
		sb.append("\n");
		return sb.toString();
	}
}

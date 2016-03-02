package com.thoughtworks.priter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.market.sale.SalePlan;
import com.thoughtworks.model.SaleModel;

public class Printer {

	private float sum;
	private float save;
	private Map<String,Integer> threefortwo = new HashMap<>();
	
	private List<Map<String,Description>> details = new ArrayList<>();
	
	public Printer(List<Map<String,Description>> dt) {
		this.details = dt;
	}
	/*
	 * 汇总
	 */
	public void addition(){
		SaleModel sm = new SaleModel();
		Description dcp = new Description();
	   	for(Map<String,Description> detail:details){
	   		for(String code: detail.keySet()){
	   			dcp = detail.get(code);
	   			if(sm.getSale(code) == SalePlan.ThreeForTow){
	   				threefortwo.put(dcp.getName(), dcp.getNum()/3);
	   			}
	   			sum += dcp.getSum();
	   			save += dcp.getSave();
	   		}
	   	}
	}
	
	/*
	 * 打印
	 * 
	 */
	public void print(){
		System.out.println("=============赚钱杂货铺===============");
		
		for(Map<String,Description> good:details){
			for(String code:good.keySet()){
				System.out.println(good.get(code).toString());
			}
		}
		System.out.println("======================================");
		if(threefortwo != null && threefortwo.size() > 0){
			System.out.println("买二赠一商品:");
			for(String name:threefortwo.keySet()){
				System.out.println("名称:"+name+"\t 数量:"+threefortwo.get(name));
			}
			System.out.println("======================================");
		}
		System.out.println("总计:"+sum);
		if(save > 0)
			System.out.println("节省:"+save);
	}
}

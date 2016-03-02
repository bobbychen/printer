package com.thoughtworks.model.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.thoughtworks.market.sale.SalePlan;
import com.thoughtworks.model.SaleModel;

public class SaleModelTest {
	
	public static void getSale(){
		SaleModel sm = new SaleModel();
		sm.addSale("123", SalePlan.ThreeForTow);
		sm.addSale("12323", SalePlan.ThreeForTow);
		sm.addSale("1243", SalePlan.ThreeForTow);
		sm.addSale("1523", SalePlan.ThreeForTow);
		sm.addSale("1623", SalePlan.NinetyFivePre);
		sm.addSale("1823", SalePlan.NinetyFivePre);
		
		List<String> codes = new ArrayList<>();
		codes.add("1231425");
		Map<String,SalePlan> rs = sm.getSale(codes);
		for(String key:rs.keySet()){
			System.out.println(key+"\t"+rs.get(key));
		}
	}
	public static void main(String[] args) {
			getSale();
	}
}

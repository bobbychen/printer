package com.thoughtworks.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.market.sale.SalePlan;

public class SaleModel {

	private static Map<String,SalePlan> sales = new HashMap<>();//模拟数据源
	
	/**
	 * 增加一个销售策略
	 * @param code
	 * @param sp
	 * @return
	 */
	public boolean addSale(String code,SalePlan sp){
		sales.put(code, sp);
		return true;
	}
	
	/**
	 * 获取商品的销售策略 
	 * @param codes
	 * @return
	 */
	public Map<String,SalePlan> getSale(List<String> codes){
		Map<String,SalePlan> rs = new HashMap<String,SalePlan>();
		for(String code : codes){
			rs.put(code, sales.get(code));
		}
		return rs;
	}
	
	public SalePlan getSale(String code){
		return sales.get(code);
	}
}

package com.thoughtworks.model;

import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.market.sale.Good;

public class GoodModel {
	
	private static Map<String,Good> goods = new HashMap<>();//模拟数据源
	
	/**
	 *返回商品信息
	 * @param code
	 */
	public Good getGoodInfo(String code){
		if(code == null || "".equals(code)){
			return null;
		}
		return goods.get(code);
	}
	
	/**
	 * 添加商品
	 * @param good
	 * @return
	 */
	public boolean addGoodInfo(Good good){
		if(good == null || good.getCode() == null || good.getPrice() == 0){
			return false;
		}
		goods.put(good.getCode(), good);
		return true;
	}
}

package com.thoughtworks.printer.service;

import java.util.List;
import java.util.Map;

public interface PrintService {
	
	/**
	 * 根据物品的条形码返回物品的销售方案
	 * @param code
	 * @return
	 */
	public List<String> getSaleByCode(String code);
	
	/**
	 *计算一种商品的价格 
	 * @param code 物品条形码
	 * @param num
	 * @return
	 */
	public float getUnitPriceByCode(String code,int num);

	/**
	 *返回计算总和
	 * @param cart
	 * @return
	 */
	public float getSumPay(Map<String,Integer> cart);
}

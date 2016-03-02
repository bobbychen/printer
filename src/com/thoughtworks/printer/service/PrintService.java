package com.thoughtworks.printer.service;

import java.util.List;
import java.util.Map;

import com.thoughtworks.priter.Description;

public interface PrintService {
	
	/**
	 * 根据传入的条形码及商品数量信息，进行计算
	 * @param infos
	 * @return
	 */
	public List<Map<String,Description>> caculation(List<Map<String,Integer>> infos);
	
	/**
	 * 计算单品的价格
	 * @param code
	 * @param num
	 * @return
	 */
	public Description caculation(String code,int num);
}

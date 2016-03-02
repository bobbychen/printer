package com.thoughtworks.printer.service;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.market.sale.Good;
import com.thoughtworks.market.sale.SalePlan;
import com.thoughtworks.model.GoodModel;
import com.thoughtworks.model.SaleModel;
import com.thoughtworks.priter.Description;

public class PrintServiceImpl implements PrintService {

	/*
	 * 计算
	 */
	@Override
	public List<Map<String, Description>> caculation(List<Map<String, Integer>> infos) {
		List<Map<String, Description>> result = new ArrayList<>();
		Description dsp = new Description();
		
		for(Map<String,Integer> info:infos){
			for(String code:info.keySet()){
				Map<String,Description> map = new HashMap<>();
				int num = info.get(code);
				dsp = caculation(code, num);
				map.put(code, dsp);
				result.add(map);
			}
		}
		
		return result;
	}
	
	@Override
	public Description caculation(String code, int num) {
		GoodModel gm = new GoodModel();
		SaleModel sm = new SaleModel();
		
		Good good = gm.getGoodInfo(code);
		Description dscp = new Description(good);
		double sum = 0;
		double save = 0;
		SalePlan sp = sm.getSale(code);
		if(sp == null){
			sp = SalePlan.No;
		}
		switch (sp) {
			case ThreeForTow: // (num/3)* (2*price)+ (num % 3) * price 
				int sale = num / 3;
				int mod = num % 3;
				sum = sale * 2 * good.getPrice() + mod * good.getPrice();
				save = sale * good.getPrice();
				break;
			case NinetyFivePre:
				sum = num * good.getPrice() * 0.95;
				save = num * good.getPrice() * 0.05;
				
				NumberFormat nf = NumberFormat.getInstance();
				nf.setRoundingMode(RoundingMode.HALF_UP);
				nf.setMaximumFractionDigits(1);
				nf.setMinimumFractionDigits(1);
				//添加一个四舍五入的过程
				
				sum = Double.parseDouble(nf.format(sum));
				save = Double.parseDouble(nf.format(save));
				break;
			default:
				sum = num * good.getPrice();
				break;
		}
		dscp.setNum(num);
		dscp.setSum(sum);
		dscp.setSave(save);
		return dscp;
	}
}

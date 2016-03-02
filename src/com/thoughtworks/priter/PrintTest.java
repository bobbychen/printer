package com.thoughtworks.priter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.market.sale.Good;
import com.thoughtworks.market.sale.SalePlan;
import com.thoughtworks.model.GoodModel;
import com.thoughtworks.model.SaleModel;
import com.thoughtworks.printer.service.PrintService;
import com.thoughtworks.printer.service.PrintServiceImpl;

public class PrintTest {
	
	static{
		Good cola = new Good("123", "可口可乐", 3);
		Good badminton = new Good("124", "羽毛球", 1.5f);
		Good apple = new Good("125", "苹果", 5.50f);
		GoodModel gm = new GoodModel();
		gm.addGoodInfo(cola);
		gm.addGoodInfo(badminton);
		gm.addGoodInfo(apple);
		
		//添加销售策略
		SaleModel sm = new SaleModel();
		sm.addSale("123", SalePlan.ThreeForTow);
		sm.addSale("124", SalePlan.NinetyFivePre);
	}
	
	public static void normal(){
		//加入购物车
		Map<String,Integer> item = new HashMap<String,Integer>();
		item.put("123", 3);
		Map<String,Integer> item2 = new HashMap<String,Integer>();
		item2.put("124", 5);
		List<Map<String,Integer>> cart = new ArrayList<>();
		
		cart.add(item);
		cart.add(item2);
		
		//计算
		PrintService service = new PrintServiceImpl();
		List<Map<String,Description>> details = service.caculation(cart);
		
		Printer printer = new Printer(details);
		printer.addition();
		printer.print();
	}

	public static void noThreeforTwo(){
		Map<String,Integer> item = new HashMap<String,Integer>();
		item.put("125", 3);
		Map<String,Integer> item2 = new HashMap<String,Integer>();
		item2.put("124", 5);
		List<Map<String,Integer>> cart = new ArrayList<>();
		
		cart.add(item);
		cart.add(item2);
		
		//计算
		PrintService service = new PrintServiceImpl();
		List<Map<String,Description>> details = service.caculation(cart);
		
		Printer printer = new Printer(details);
		printer.addition();
		printer.print();
	}
	public static void both(){
		Map<String,Integer> item = new HashMap<String,Integer>();
		item.put("125", 3);
		Map<String,Integer> item2 = new HashMap<String,Integer>();
		item2.put("124", 5);
		Map<String,Integer> item3 = new HashMap<String,Integer>();
		item2.put("123", 3);
		List<Map<String,Integer>> cart = new ArrayList<>();
		
		cart.add(item);
		cart.add(item2);
		cart.add(item3);
		
		//计算
		PrintService service = new PrintServiceImpl();
		List<Map<String,Description>> details = service.caculation(cart);
		
		Printer printer = new Printer(details);
		printer.addition();
		printer.print();
	}
	
	public static void main(String[] args) {
		normal();
		System.out.println("***************************************");
		noThreeforTwo();
		System.out.println("***************************************");
		both();
	}

}

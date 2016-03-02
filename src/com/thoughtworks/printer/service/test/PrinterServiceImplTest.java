package com.thoughtworks.printer.service.test;

import com.thoughtworks.market.sale.Good;
import com.thoughtworks.market.sale.SalePlan;
import com.thoughtworks.model.GoodModel;
import com.thoughtworks.model.SaleModel;
import com.thoughtworks.printer.service.PrintService;
import com.thoughtworks.printer.service.PrintServiceImpl;
import com.thoughtworks.priter.Description;

public class PrinterServiceImplTest {

	public static void caculation(){
		GoodModel gm = new GoodModel();
		Good good = new Good("123", "apple", 5.42f);
		gm.addGoodInfo(good);
		
		SaleModel sm = new SaleModel();
		sm.addSale("123", SalePlan.ThreeForTow);
		
		PrintService psi = new PrintServiceImpl();
		Description dcp = psi.caculation("123",8);
		System.out.println(dcp.toString());
	}
	public static void main(String[] args) {
		caculation();
	}
}

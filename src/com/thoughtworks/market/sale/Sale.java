package com.thoughtworks.market.sale;

public class Sale {
	
	private String code;
	private SalePlan sp;
	
	public Sale(String code,SalePlan sp) {
		this.code = code;
		this.sp = sp;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SalePlan getSp() {
		return sp;
	}

	public void setSp(SalePlan sp) {
		this.sp = sp;
	}
	
//	private static Map<String,List<String>> SalePlan = new HashMap<String,List<String>>();//模拟销售方案
//	
//	public static Map<String,List<String>> getInstance() {
//		if(SalePlan == null){
//			SalePlan = new HashMap<String,List<String>>();
//		}
//		return SalePlan;
//	}
//	
//	/**
//	 * 添加一个商品的销售策略
//	 * @param code
//	 * @param saleplan
//	 * @throws Exception 
//	 */
//	public static void addSalePlan(String code,List<String> saleplan) throws Exception{
//		
//		if(SalePlan == null){
//			throw  new Exception("Please getInstance of SalePlan Object");
//		}
//		SalePlan.put(code, saleplan);
//	}
//	/**
//	 * 获取单个物品的销售策略
//	 * @param code
//	 * @return 销售策略
//	 * @throws Exception 
//	 */
//	public static List<String> getSalePlan(String code) throws Exception{
//		
//		if(SalePlan == null){
//			throw  new Exception("Please getInstance of SalePlan Object");
//		}
//		List<String> saleplan = SalePlan.get(code);
//		return saleplan;
//	}
//	
//	/**
//	 * 获取多个物品的销售策略
//	 * @param codes
//	 * @return
//	 * @throws Exception 
//	 */
//	public static Map<String,List<String>> getSalePlan(List<String> codes) throws Exception{
//		
//		if(SalePlan == null){
//			throw  new Exception("Please getInstance of SalePlan Object");
//		}
//		if(codes == null || codes.size() == 0){
//			throw new Exception("Your Cart is empty!");
//		}
//		Map<String,List<String>> salePlans = new HashMap<String,List<String>>();
//		
//		for(String code:codes){
//			List<String> saleplan = SalePlan.get(code);
//			if(saleplan == null) continue;
//			salePlans.put(code, saleplan);
//		}
//		return salePlans;
//	}
}

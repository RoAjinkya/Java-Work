package edu.neu.csye6200.pojo;

public class Stock {
	String name;
	Double stockPrice;
	Float stokeTarget;
	Float stoploss;
	String Advice;
	
	public Stock(){
		
	}
	
	
	public Stock(String name, Double stockPrice, Float stokeTarget, Float stoploss, String advice) {
		super();
		this.name = name;
		this.stockPrice = stockPrice;
		this.stokeTarget = stokeTarget;
		this.stoploss = stoploss;
		Advice = advice;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Float getStokeTarget() {
		return stokeTarget;
	}
	public void setStokeTarget(Float stokeTarget) {
		this.stokeTarget = stokeTarget;
	}
	public Float getStoploss() {
		return stoploss;
	}
	public void setStoploss(Float stoploss) {
		this.stoploss = stoploss;
	}
	public String getAdvice() {
		return Advice;
	}
	public void setAdvice(String advice) {
		Advice = advice;
	}
	
	@Override
	public String toString() {
		return "|"+ name + "  |     " + stockPrice + "    |    " + stokeTarget + "   |    "
				+ stoploss + "   |    " + Advice+ "|" ;
	}
	
	
	

}

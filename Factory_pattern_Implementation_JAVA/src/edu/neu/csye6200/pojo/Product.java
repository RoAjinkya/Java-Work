package edu.neu.csye6200.pojo;

public class Product {
	
	private String productName; 
	private Integer productId;
	private Float price;
	private Integer count;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + ", count="
				+ count + "]";
	}
	
	
	

}

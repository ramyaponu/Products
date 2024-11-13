package com.NewWorks.Ecommerce.Entity;

import java.time.LocalDate;

public class ProductsDto {

	Integer productId;
	String productName;
	String productDescription;
	Integer rating;
	Integer productCost;
	LocalDate deliveryDate;
	 String productColor;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getProductCost() {
		return productCost;
	}
	public void setProductCost(Integer productCost) {
		this.productCost = productCost;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	
	public ProductsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", rating=" + rating + ", productCost=" + productCost + ", deliveryDate="
				+ deliveryDate + ", productColor=" + productColor + "]";
	}
	 
}

package com.hw1.model.vo;

public class Product {

	private int pld;
	private String pName;
	private int price;
	private double tax;
	
	public Product() {}
	
	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	public String information() {
		return "a";
	}
}

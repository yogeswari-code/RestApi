package com.example.demo.Model;

public class Payment {

	private String productname;
	private int productprice;
	
	
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public static Payment of(String productname, int productprice) {
		
		Payment p = new Payment();
		
		p.setProductname(productname);
		p.setProductprice(productprice);
		
		return p;
	}
}

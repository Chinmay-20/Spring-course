package com.springcore.lifecycle;

public class samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}
	
	public void init()
	{
		System.out.println("init method");
	}
	
	public void destroy()
	{
		System.out.println("destroy method");
	}
}

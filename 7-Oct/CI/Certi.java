package com.springcore.ci;

public class Certi {
	private String name;

	public Certi(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString()
	{
		return this.name;
	}
}

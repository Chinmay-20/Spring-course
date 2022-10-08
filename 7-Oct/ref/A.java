package com.springcore.ref;

public class A {
	private int a;
	private B obj;
	public int geta() {
		return a;
	}
	public void seta(int a) {
		this.a = a;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [A=" + a + ", obj=" + obj + "]";
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.valid.sessions;

public class SuperTwo extends SuperOne {
	
	int data =100;
	
	@Override
	public void data() {
		int data2 = data - super.data;
		System.out.println(data2);
	}
	
	@Override
	public void value() {
		super.data();
		super.value();
	}
	
	public void far() {
		
	}

}

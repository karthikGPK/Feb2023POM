package com.valid.sessions;

public class SampleB extends SampleA{
	
	@Override
	public void data() {
		System.out.println("Data one from sample B");
	}
	
	@Override
	public void value() {
		System.out.println("Value from Sample B");
	}
	
	public static void main(String[] args) {
		SampleB b = new SampleB();
		b.data();
		b.value();
		
		String re = "Dell";
		int lastIndexOf = re.lastIndexOf('l');
		
	
	}

}

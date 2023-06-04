package com.valid.sessions;

public class AllInOne {
	
	int a; // Class Varaible or Global Variable
	String data;
	double beta;
	long value;
    static int num = 100;
    static String go ="value"; // 
    static long l = 89789789l; // Static long
    final int one = 100;     // -- final NS integer
    final static String b = "kar"; // --final S String
    
    public AllInOne() {
    	System.out.println("Dfault Cons");
    }
    public AllInOne(int a) {
    	System.out.println("one param cons");
    }
    public AllInOne(String b, int a) {
    	System.out.println("two param constr");
    	
    }
    
    public void one() { // Non static
    	
    }
    public void one(int a) {
    	
    }
    
    public static void two() { // Static Met
    	
    }
    
    public static void two(String a) {
    	
    }
    
    public final void delta() {
    	
    }
    
    public final void delta(int a) {
    	
    }
    
    
    

	public static void main(String[] args) {
		AllInOne ao = new AllInOne();
		// Metods calling - Static and Non-Static
		ao.one();
		ao.one(10);
		two();
		two("kar");
		ao.delta();
		ao.delta(10);

	}

}

package org.dpw.test;

public class StringOne {

	public static void main(String[] args) {


		
		String s ="Selenium"; // Literals
		String s1 = "Selenium";
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		
		System.out.println(s == s1); // true
		System.out.println(s.equals(s1)); // true
		
		String s2 = new String("Selenium"); // Non-literals
		String s3 = new String("Selenium");
		
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		
		System.out.println(s == s2); // == False
		System.out.println(s.equals(s2)); // True
		
		
		System.out.println("*********Immutable********");
		
		String s4 ="Data";
		String s5 = "value";
		
		String s6 = s4.concat(s5);
		System.out.println(s4);
		
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s4));
		
		
		String s7 = new String("Data");
		String s8 = new String("value");
		String s9 = s7.concat(s8);
		System.out.println(s9);
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		
		System.out.println("*********MUmutable********");
		
		
		StringBuilder one = new StringBuilder("Data");
		StringBuilder two = new StringBuilder("value");
		StringBuilder value = one.append(two);
		System.out.println(value);
		System.out.println(System.identityHashCode(one));
		System.out.println(System.identityHashCode(two));
		
		
		
		
		
		

		
		

	}

}

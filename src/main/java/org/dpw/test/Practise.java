package org.dpw.test;

public class Practise { // String Reverse

	public static String reverseString(String value) {

		String rev = "";
		if (value.length() == 1) {
			return value;
		}
		else {

		for (int i = value.length() - 1; i >= 0; i--) {
			rev = rev + value.charAt(i);
		}
		}
	return rev;
	}
	public static void main(String[] args) {
		
		String reverseString = reverseString("value");
		System.out.println(reverseString);
		
	}

}

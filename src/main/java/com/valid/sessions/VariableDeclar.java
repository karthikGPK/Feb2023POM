package com.valid.sessions;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclar {

	public static void main(String[] args) {
		
		
		int number = 10;
		String data ="value";
		
		List<String> al = new ArrayList<String>();
		System.out.println(al.size());
		
		for (int i = 0; i < al.size(); i++) {
			if(number==10) {
				number = 30;
				data="value_";
			}
			else {
				if (!(number<100)) {
					number = 0;
				}
				else {
				
				number = 40;
				data="Value_123";
			}
		}

	}
		System.out.println(number);
		System.out.println(data);
	}
	
}

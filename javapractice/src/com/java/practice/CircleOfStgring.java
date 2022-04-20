package com.java.practice;

import java.util.Arrays;
import java.util.List;

public class CircleOfStgring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] A = { "ab" , "bssssc", "casasd", "da" };
		
		
		List<String> list = Arrays.asList(A);
		boolean flag = false ;
	for(String  s: list) {
		char c = s.charAt(s.length()-1);
		for(int i =0; i< list.size(); i++) {
			if(s != list.get(i)) {
			if(c != list.get(i).charAt(0)) {
				flag = true;
			}
		}
		}
		
		
	}
	
	if(!flag) {
		System.out.println("yes");
	}
	
	}

}

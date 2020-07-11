package com.seleniumconcept;

import java.util.HashMap;

public class OccurrencesOfCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingByLoop();
		String st= "madhura";
		
		HashMap<Integer,Character> map = new HashMap<Integer,Character>();
		
		
		char[] cha = st.toCharArray();
		
		for(int i = 0; i<cha.length; i++) {
			
			System.err.println(cha[i]);
			map.put(i, cha[i]);
			
			
		}
		
		System.err.println(map);
		
	
	}
	
	public static void checkingByLoop() {
		
		String ab= "bharadwaj";
		
		char[] arr = ab.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int count =0;
			for(int j=0; j<arr.length; j++ ) {
				
				if(arr[j]==arr[j]) {
					count++;
					System.err.println("pass");
					System.err.println(count);
				}
				
			}
			
			
			
			
		}
		
		
		
		
	}

}

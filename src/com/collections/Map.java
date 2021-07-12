package com.collections;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Venkat", "Raju");
		map.put("Prasanna", "Lakshmi");
		map.put("Thanvith", "Raj");
		for( java.util.Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("Key"+" "+entry.getKey()+" "+"Value"+" " +entry.getValue());
			
		}
	}

}

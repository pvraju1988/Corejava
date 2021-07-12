package com.collections;

public class Overloaded {
	
	public Object m1(Object ob) {
		return "Object calss method";
	}
	public String m1(String s) {
		return "Object calss method";
	}
	public static void main(String[] args) {
		Overloaded overloaded = new Overloaded();
		
		//String s1=null;
		System.out.println(overloaded.m1(null));
	}

}

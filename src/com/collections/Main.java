package com.collections;

public class Main {
public static void main(String[] args) {
	int a= 10;
	int b = 20;
	b = a+b;
	a= b-a;
	b= b-a;
	
	System.out.println("a =" +a+"b="+b);
	MyInterface ref;
	Myinterface1 rMyinterface1;
	
	ref=()->3.456;
	System.out.println(ref.getvalue());
	
	rMyinterface1 = ()->"Hello Lamda";
	System.out.println(rMyinterface1.hello());
	String s="hello";
	char result;
	
	
	String s1= "Venkat";
	
	char [] ch= s1.toCharArray();
	
	for(int  i= ch.length-1; i>=0; i--) {
		System.out.println(ch[i]);
	}
	
	
	
	for(int i=s.length()-1;  i>=0; i--) {
		result =s.charAt(i);
		System.out.println(result);
		
		Myinterface2 reMyinterface2;
		
		
		
		
		
	
		
	}
	
	
}
}

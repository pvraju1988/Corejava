package com.collections;

public class TharedDemo  implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	public String hello() {
		return"normal methodcalling";
	}
	
	
public static void main(String[] args) {
	 TharedDemo demo = new TharedDemo();
	 
	Thread t = new Thread(demo);
	t.start();
	 
}
}

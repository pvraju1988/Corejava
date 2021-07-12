package com.collections;

public class LargestelemnetinArray {
	
	public static int getLargest(int a[], int total) {
		System.out.println("Hello Conflict");
		int temp;
		
		for(int i =0; i<total; i++) {
		for (int j= i+1; j<total; j++ ) {
			if (a[i] < a[j]) {
				System.out.println("Hi");
				temp =a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
		}
			
		}
		return a[total-1];
	}
public static void main(String[] args) {
	
	int a[] = {1,2,3,4,10,11};
	int  b[]= {65,64,67,87};
	
	System.out.println("largest"+getLargest(a, 5));
	System.out.println("largest"+getLargest(b, 4));
			
}
}

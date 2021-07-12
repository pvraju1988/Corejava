package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamList {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1, "HP", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenovo Laptop", 25000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple LaptopP", 90000f));
		
		List<Float> productPriceList2 = products.stream()
				                        .filter(p->p.price>30000)
				                        .map(p->p.price)
				                        .collect(Collectors.toList());
		System.out.println(productPriceList2);
		products.stream()
		.filter(poduct->poduct.price==30000)
		.forEach(product->System.out.println(product.name));
		
	}

}

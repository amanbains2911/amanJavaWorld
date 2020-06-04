/**
 * 
 */
package com.aman.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author amanb
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 10);

		for (int i = 0; i < values.size(); i++) {
			System.out.println("External iterator 1-->"+values.get(i));
		}

		for (int e : values) {
			System.out.println("External iterator 2-->"+e);
		}
		
		values.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				//System.out.println("External iterator 3-->"+t);
				
			}
			
		});
		
	    values.forEach((Integer value) -> System.out.println("External iterator 4-->"+value));
		
		values.forEach(value -> System.out.println("External iterator 5-->"+value));
		
		values.forEach(System.out::println);
		
		System.out.println(values.stream()
				.map(e-> e*2)
				.reduce(0,(c,e)-> c + e));
		
		System.out.println(totalValue(values,e->true));
		System.out.println(totalValue(values,e-> e%2==0));
		System.out.println(totalValue(values,e-> e%2!=0));
		System.out.println(values.stream()
				                  .filter(e->e>3)
				                  .filter(e->e%2==0)
				                  .map(e->e)
				                  .findFirst()
				                  .orElse(0));
	}

	public static int totalValue(List<Integer> values, Predicate<Integer> selector) {
		// TODO Auto-generated method stub
		return values.stream()
				     .filter(selector)
				     .reduce(0, (c,e)-> c+e);
	}

}

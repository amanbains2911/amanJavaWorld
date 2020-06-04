/**
 * 
 */
package com.aman.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author amanb
 *
 */
public class PredicateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 Predicate<Integer> predicate = t -> t%2==0;
		 System.out.println(predicate.test(6));
		 
		 List<Integer> al=Arrays.asList(1,12,3,4,6,5,8,7);
		 al.stream().filter(predicate)
		            .sorted()
		            .forEach(t -> System.out.println("Print Even--"+t));
	}

}

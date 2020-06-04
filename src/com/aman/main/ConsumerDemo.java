/**
 * 
 */
package com.aman.main;

import java.util.Arrays;
import java.util.List;

/**
 * @author amanb
 *
 */
public class ConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(1,2,3,4,6,5,6,7);
		
		al.stream().forEach(t -> System.out.print(t));
		

	}

}

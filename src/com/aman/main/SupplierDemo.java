/**
 * 
 */
package com.aman.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author amanb
 *
 */
public class SupplierDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 List<String> al=Arrays.asList("aan","nan","uiin","uii");
		 System.out.println(al.stream().findAny().orElseGet(()->"Hi Aman Java"));
	}

}

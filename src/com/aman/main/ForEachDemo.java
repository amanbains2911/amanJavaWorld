/**
 * 
 */
package com.aman.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author amanb
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		
		al.add("man");
		al.add("maneet");
		al.add("aman");
		al.add("harman");
		al.add("mankind");
		
		
		al.stream()
		  .filter(t->t.startsWith("m"))
		  .forEach(t->System.out.println(t));
		
		Map<Integer,String> hm=new HashMap<>();
		
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		hm.put(4,"d");
		
		//hm.forEach((key,value)->System.out.println(key+": "+value));
		
		hm.entrySet().stream()
		.filter(k->k.getKey()%2==0)
		.forEach(t -> System.out.println(t));
	}

}

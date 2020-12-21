package com.datastructure.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class ShuffleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		  Map<Integer,String> map1 = new HashMap<Integer,String>();
		    Map<Integer,String> map2 = new HashMap<Integer,String>();
		    map1.put(1,"A");
		    map1.put(2,"B");
		    map1.put(3,"Varun");
		    
		    map2.put(10,"AB");
		    map2.put(2,"B");
		    map2.put(30,"Varun");
		    
		//    System.out.println(map1);
		//    System.out.println(map2);
		    Set <Entry<Integer,String>> entry1 = map1.entrySet();
		    Set <Entry<Integer,String>> entry2 = map2.entrySet();
		    for (Entry<Integer, String> entry3 : entry1) {
		    	for (Entry<Integer, String> entry4 : entry2) {
					if((entry3.getKey() == entry4.getKey()) && (entry3.getValue().equals(entry4.getValue()))){
						System.out.println(entry3);
					}
				}
				
			}*/
		Map<Integer, Integer> entries = new HashMap<Integer, Integer>();
		entries.put(1, 10);
		entries.put(50, 70);
		entries.put(35, 36);
		Set <Entry<Integer,Integer>> entry1 = entries.entrySet();
		System.out.println("5 =" +contains(5, entry1));
		System.out.println("40" +contains(40, entry1));
		System.out.println("70" +contains(70, entry1));
		
	}
	
	public static boolean contains(int num, Set <Entry<Integer,Integer>> n){
		for (Entry<Integer, Integer> entry : n) {
			if(num>=entry.getKey() && num<=entry.getValue())
				return true;
		}
		return false;
	}

}

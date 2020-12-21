package com.java.collections;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListTest {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
		
		LocalTime timeforstart = LocalTime.now();
		for (int i = 0; i < 10000; i++) {
			list.get(i);
		}
		LocalTime timeforend = LocalTime.now();
		System.out.println(timeforend.getNano()-timeforstart.getNano());
		
		
		
		for (Iterator<Integer> i=list.iterator(); i.hasNext(); ){
			         i.next();
		}
		LocalTime timelistend = LocalTime.now();
		System.out.println(timelistend.getNano()-timeforend.getNano());
		
		String[] as = {"Aman"};
		List<String> strings = new ArrayList<String>();
		strings.add("Chetan");
		strings.add(null);
		strings.add("Surabhi");
	//	strings.add(null);
		System.out.println(strings.size());
		System.out.println(strings);
		//strings.add("Pooja");
		String[] str=strings.toArray(new String[]{"Jagat","Ankita","Pooja","Aman","Baghat","Deepika","Anuj"});
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println(strings.removeAll(new ArrayList<String>()));
	}

}

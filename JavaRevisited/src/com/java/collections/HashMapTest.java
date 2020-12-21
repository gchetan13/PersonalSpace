package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> namefrom = new HashMap<String, String>();
		namefrom.put("Chetan", "Shujalpur");
		namefrom.put("Jagat", "Jhansi");
		namefrom.put(null, "noting");
		namefrom.put("Anniruddha", "Indore");
		namefrom.put(null, "NONE");
		namefrom.put(null, null);
		namefrom.put("Aman", null);
		namefrom.put("Baman", null);
		System.out.println(namefrom);
		
	}

}

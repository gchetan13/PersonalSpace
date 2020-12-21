package com.java8.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
public static void main(String[] args) {
	//HashMap<String, String> map = new HashMap<String, String>();
	
	Map<String, String> strings = new HashMap<String, String>(15, 0.5f);
	Map<String, String> conHashMap = new ConcurrentHashMap<String, String>();
	
	
	strings.put(null, null);
	conHashMap.put(null, null);
	System.out.println(strings);
	System.out.println(conHashMap);
	System.out.println(strings.size());
	System.out.println(conHashMap.size());
}

}

package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		String s1 = new String("Chetan");
		String s2 = new String("Chetan");
		map.put(s1, 1);
		map.put(s2, 2);
		System.out.println(map.get(new String("Chetan")));
		System.out.println(map.size());
		Lock lock =  new ReentrantLock();
		lock.lock();

	}

}

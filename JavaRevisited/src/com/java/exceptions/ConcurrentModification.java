package com.java.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModification {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		Iterator<Integer> iterator =	ints.iterator();
		while(iterator.hasNext()){
			int value = iterator.next();
			System.out.println(value);
			if(value==3)
				ints.add(8);
		}
		for(int i=0;i<ints.size();i++){
			
		}
	}
}

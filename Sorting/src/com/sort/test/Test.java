package com.sort.test;

import com.sort.bubble.BubbleSort;
import com.sort.insertion.InsertionSort;
import com.sort.selection.SelectionSort;

public class Test {

	public static void main(String[] args) {
		int[] arr = {4,0,0,2,0,3,0};
		int lastzeroindex =0;
		boolean islast=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				arr[lastzeroindex++]=arr[i];

		}

		for (int i = lastzeroindex; i < arr.length; i++) {
			arr[lastzeroindex++]=0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

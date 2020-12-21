package com.practice.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumEqualsSubSet {

	public static List<List<Integer>> subSetSum(int[] arr,int sum){
		List<Integer> lessThanSum = new ArrayList<Integer>();
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<sum)
				lessThanSum.add(arr[i]);
		}
		Collections.sort(lessThanSum);
		System.out.println("Sorted List  "+lessThanSum);
		int subsetsum=0;
		int index=0;
		List<List<Integer>> subsetList = new ArrayList<List<Integer>>();
		for (int i = 0; i < lessThanSum.size(); i++) {
			List<Integer> indexes=new ArrayList<Integer>();
			subsetsum=lessThanSum.get(i);
			indexes.add(lessThanSum.get(i));
			index=i+1;
			
			while(index<lessThanSum.size()){
				for (int j=index; j < lessThanSum.size(); j++) {
					System.out.println(lessThanSum.get(i)+"  "+lessThanSum.get(j)+" "+subsetsum);
					indexes.add(lessThanSum.get(j));
					if(subsetsum<sum){
						subsetsum+=lessThanSum.get(j);
						if(subsetsum==sum){
							subsetList.add(indexes);
							System.out.println("true "+indexes);
						}
					}
					else{
						subsetsum=lessThanSum.get(i);
						indexes.clear();
						indexes.add(lessThanSum.get(i));
					}
				}
				subsetsum=lessThanSum.get(i);
				indexes.clear();
				indexes.add(lessThanSum.get(i));
				index++;
			}
			//subsetsum=0;
		}		
		System.out.println("List Length "+subsetList.size());
		//System.out.println(subsetList.get(0)[0]+" "+subsetList.get(0)[1]+" "+subsetList.get(0)[2]+" "+subsetList.get(0)[3]);
		return subsetList;
	}
	
	public static void main(String[] args) {
		int[] array = {3,1, 34, 4, 12, 5,8, 2,6};
		int sum=9;
		subSetSum(array, sum);
	}

}

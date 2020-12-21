package com.codeforces;

import java.util.Scanner;

public class KPeriodicArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s=  scanner.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		int[] nums = new int[n];
		String[] s1 = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
				nums[i]=Integer.parseInt(s1[i]);
		}
		int count_1=0;
		int count_2=0;
		int allchange=0;
		for (int i = 0; i < k; i++) {
			count_1=0;
			count_2=0;
			if(nums[i]==1) 
				count_1++; 
			else
				count_2++;
			for (int j = 0,m=i+k; j < n/k-1; j++,m=m+k) {
				if(nums[m]==1)
					count_1++;
				else
					count_2++;
			}
			if(count_1!=0 && count_2!=0){
				if(count_1>count_2)
					allchange+=count_2;
				else
					allchange+=count_1;
			}
		}
		System.out.println(allchange);
	}

}

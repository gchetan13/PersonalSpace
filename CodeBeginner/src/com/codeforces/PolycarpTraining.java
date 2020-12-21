package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class PolycarpTraining {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num=0;
		int x=1;
		int result=0;
		int[] nums = new int[n];
		int k=1;
		for (int j = 2; j < n; j++) {
			nums[j]= scanner.nextInt();
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>=k)
				k++;
		}
		System.out.println(k-1);
	}

}

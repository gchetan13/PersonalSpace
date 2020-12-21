package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class BogoSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int len=0;
		for (int i = 0; i < n; i++) {
			 len = Integer.parseInt(scanner.nextLine());
			 if(len==1)
				 System.out.println(Integer.parseInt(scanner.nextLine()));
			 else{
				 String[] s = scanner.nextLine().split(" ");
				 int[] nums = new int[s.length];
				 for (int j = 0; j < nums.length; j++) {
					nums[j]=Integer.parseInt(s[j]);
				}
				 Arrays.sort(nums);
				 int temp;
				 for (int j = 0,k=nums.length-1; j < nums.length/2; j++,k--) {
					 temp=nums[j];
					 nums[j]=nums[k];
					 nums[k]=temp;
				}
				 for (int j = 0; j < nums.length; j++) {
					System.out.print(nums[j]+" ");
				}
			 }
		}

	}

}

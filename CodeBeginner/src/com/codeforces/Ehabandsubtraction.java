package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Ehabandsubtraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrlen=	scanner.nextInt();
		int op = scanner.nextInt();
		int[] nums=new int[arrlen];
		for (int i = 0; i <arrlen ; i++) {
			nums[i]=scanner.nextInt();
		}
		Arrays.sort(nums);
		int index=0;
		int numtosubtract=0;
		for (int i = 0; i < op; i++) {
			if(i<=index)
			System.out.println(nums[index]-numtosubtract);
			else
			System.out.println(0);	
			for (int j = index; j < nums.length-1; j++) {
				if(nums[j]==nums[j+1])
					continue;
				else{
					numtosubtract=numtosubtract+nums[j+1]-nums[index];
					index=j+1;
					break;
				}
					
			}
		}		
	}

}

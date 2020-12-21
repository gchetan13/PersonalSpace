package com.codeforces._1100;

import java.util.Arrays;
import java.util.Scanner;

public class Laptops {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int  n = scanner.nextInt();
		boolean alexah=false;
		int[] prices=new int[n];
		int[] quality=new int[n];
		for (int i = 0; i < n; i++) {
			prices[i]=scanner.nextInt();
			quality[i]=scanner.nextInt();
		}
		for (int i = 1; i < n; i++) {
			for(int j=i-1;j<n-1;j++){
			if((prices[j]>prices[i] && quality[j]<quality[i]) || (prices[j]<prices[i] && quality[j]>quality[i]))
			{
				alexah=true;
				break;
			}
			}
		}
		if(alexah)
			System.out.println("Happy Alex");
		else
			System.out.println("Poor Alex");
	}

}

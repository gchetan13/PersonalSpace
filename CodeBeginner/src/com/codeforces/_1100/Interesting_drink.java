package com.codeforces._1100;

import java.util.Arrays;
import java.util.Scanner;

public class Interesting_drink {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int shops = Integer.parseInt(scanner.nextLine());
		int[] prices = new int[shops];
		int count=0;
		String[] s = scanner.nextLine().split(" ");
		for (int i = 0; i < prices.length; i++) {
			prices[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(prices);
	    int days = Integer.parseInt(scanner.nextLine());
	    int amount=0;
	    for (int i = 0; i < days; i++) {
			amount = scanner.nextInt();
			int firstindex=0;
			int lastindex=shops-1;
			int midIndex=(lastindex-firstindex)/2;
			while (firstindex <= lastindex) { 
		        int m = firstindex + (lastindex - firstindex) / 2; 
		        if (prices[m] > amount) 
		        	lastindex = m - 1;  
		        else
		        	firstindex = m + 1;
		        	
		    } 
			System.out.println(lastindex+1);
		}
	}

}

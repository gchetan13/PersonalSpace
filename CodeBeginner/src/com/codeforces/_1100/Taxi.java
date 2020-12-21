package com.codeforces._1100;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n= Integer.parseInt(scanner.nextLine());
		String[] s = scanner.nextLine().split(" ");
		//int[] nums = new int[n];
		int count_4=0;
		int count_3=0;
		int count_2=0;
		int count_1=0;
		int taxi=0;
		for (int i = 0; i < s.length; i++) {
			if(Integer.parseInt(s[i])==4)
				count_4++;
			else if(Integer.parseInt(s[i])==3)
				count_3++;
			else if(Integer.parseInt(s[i])==2)
				count_2++;
			else if(Integer.parseInt(s[i])==1)
				count_1++;
		}
		taxi=count_4;
		taxi+=count_3;
		count_1=count_1-count_3;
		
		taxi+=(count_2/2);
		if(count_2%2==1){
			taxi=taxi+1;
			count_1=count_1-2;
		}
			
		if(count_1>0){
			if(count_1%4==0)
				taxi+=count_1/4;
			else
				taxi+=count_1/4+1;
		}
		
		System.out.println(taxi);
	}

}

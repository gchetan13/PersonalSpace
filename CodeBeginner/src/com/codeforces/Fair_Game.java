package com.codeforces;

import java.util.Scanner;

public class Fair_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int num1=scanner.nextInt();
		int num2=0;
		int nextnum=0;
		int i=0;
		int num1count=1;
		int num2count=0;
			for (i = 0; i < n-1; i++) {
				nextnum=scanner.nextInt();
				if(nextnum!=num1)
					num2=nextnum;
				if(nextnum==num1) {
					num1count++;
				}
				else if(nextnum==num2)
					num2count++;
			}
			if(num1count==num2count){
				System.out.println("YES");
				System.out.println(num1+" "+num2);
			}
			else
				System.out.println("NO");
		
	
	}

}

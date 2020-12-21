package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class DifferentisGood {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int n= Integer.parseInt(scanner.nextLine());
		 char[] chars = scanner.nextLine().toCharArray();
		 int result=0;
		 if(n>26)
			 System.out.println(-1);
		 else{
			 Arrays.sort(chars);
			 for (int i = 1; i < chars.length; i++) {
				if(chars[i]==chars[i-1])
					result++;
			}
			 System.out.println(result);
		 }
			 
	}

}

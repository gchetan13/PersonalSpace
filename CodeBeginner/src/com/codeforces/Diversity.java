package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Diversity {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.nextLine().toCharArray();
		int n=	scanner.nextInt();
		if(n>s.length)
			System.out.println("impossible");
		else{
		Arrays.sort(s);
		
		int diffchars=1;
		for (int i = 1; i < s.length; i++) {
			if(s[i]!=s[i-1])
				diffchars++;
		}
			if(n<=diffchars)
			System.out.println(0);
			else
			{
				System.out.println(n-diffchars);
			}
					}
		
	}

}

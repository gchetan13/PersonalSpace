package com.codeforces._1100;

import java.util.Scanner;

public class IlyaandQueries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.nextLine().toCharArray();
		int[] n = new int[s.length];
		int sum=0;
		for (int i = 1; i < s.length; i++) {
			if (s[i - 1] == s[i])
				n[i]=n[i-1]+1;
			else
				n[i]=n[i-1];
		}
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println(-n[scanner.nextInt()-1]+n[scanner.nextInt()-1]);
		}
	}
}

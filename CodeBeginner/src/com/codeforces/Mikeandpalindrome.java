package com.codeforces;

import java.util.Scanner;

public class Mikeandpalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int count = 0;
		if (s.length() == 1)
			System.out.println("YES");
		else {
			for (int i = 0, k = s.length() - 1; i < s.length() / 2; i++, k--) {
				if (s.charAt(i) != s.charAt(k))
					count++;
			}

			if (count == 1)
				System.out.println("YES");
			else if(count==0 && s.length()%2==1)
				System.out.println("YES");
			else	
				System.out.println("NO");
		}
	}

}

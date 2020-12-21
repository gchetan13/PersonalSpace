package com.codeforces;

import java.util.Scanner;

public class DiceTower {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] s = scanner.nextLine().split(" ");
		long[] pips = new long[s.length];
		for (int i = 0; i < s.length; i++) {
			pips[i] = Long.parseLong(s[i]);
			if(pips[i]<15)
				System.out.print("No");
			else if((pips[i]<21) && pips[i]>14){
				System.out.print("Yes");
			}
			else{
				long num = pips[i]%14;
				if((num==1)||(num==2)||(num==3)||(num==4)||(num==5)||(num==6))
					System.out.print("Yes");
				else
					System.out.print("No");
			}
			System.out.println();
		}
	}

}

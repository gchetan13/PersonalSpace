package com.codeforces;

import java.util.Scanner;

public class CompetitiveProgrammer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		boolean haszero=false;
		boolean iseven = false;
		int isAllZero=0;
		int sum =0;
		String s;
		for (int i = 0; i < n; i++) {
			sum=0;
			s = scanner.next();
			haszero=false;
			iseven=false;
			isAllZero=0;
			for (int j = 0; j < s.length(); j++) {
				sum+=Integer.parseInt(""+s.charAt(j)+"");
				if(s.charAt(j)=='0'){
					haszero = true;
					isAllZero++;
				}
				if((s.charAt(j)=='2')||(s.charAt(j)=='4')||(s.charAt(j)=='6')||(s.charAt(j)=='8'))
					iseven=true;
			}
			if((s.length()==isAllZero) ||  (sum%3==0 && haszero && iseven))
				System.out.println("red");
			else
				System.out.println("cyan");
			}
	}

}

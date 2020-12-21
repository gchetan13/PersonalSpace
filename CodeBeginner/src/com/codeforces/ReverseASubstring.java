package com.codeforces;

import java.util.Scanner;

public class ReverseASubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String s1=scanner.nextLine();
		char[] s = s1.toCharArray();
		boolean ans = true;
		int endindex=-1;
		int beginindex=-1;
		char[] rev=new char[s.length];
		/*for (int i = 0; i < n-1; i++) {
			if(s[i]<=s[i+1])
				continue;
			else{
				
				endindex=i+1;
			}
		}*/
		for (int i = n-1,k=0; i >=0 ; i--,k++) {
			rev[k]=s[i];
		}
		String revString = new String(rev);
			for (int j = 0; j < rev.length-1; j++) {
				for (int i = j+1; i < rev.length; i++) {
					if(revString.substring(j, i).compareTo(s1)<0){
						beginindex=j;
						endindex=i;
						
					}
				}
			}
			if(beginindex==-1)
				System.out.println("NO");
			else{
				System.out.println("YES");
				System.out.println((n-endindex-1)+" "+(n-beginindex-1));
		}
		
		
	}

}

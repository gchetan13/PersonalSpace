package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class BrokenKeyboard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String s;
		String res="";
		char[] chars;
		char[] result;
		for(int i=0;i<n;i++){
			res="";
			s=scanner.nextLine();
			if(s.length()==1)
				System.out.println(s);
			else {
				chars = s.toCharArray();
					for (int j = 0; j < chars.length-1; j++) {
						if (chars[j] == chars[j + 1])
							j++;
						else
							res += chars[j];
					}
				if(chars[chars.length-2]!=chars[chars.length-1])	
				res+=chars[chars.length-1];
				result= res.toCharArray();
				Arrays.sort(result);
				if(result.length>0){
				res="";
				res+=result[0];
				for (int j = 0; j < result.length-1; j++) {
					if (result[j] == result[j + 1])
						continue;
					else
						res += result[j+1];
				}
				System.out.println(res);
				}
				else
					System.out.println();
				
			}
		}
		
	}

}

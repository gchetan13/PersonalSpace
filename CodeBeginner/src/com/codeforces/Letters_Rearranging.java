package com.codeforces;

import java.util.Scanner;

public class Letters_Rearranging {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test =  Integer.parseInt(scanner.nextLine());
		String s =null;
		boolean palindrom = false;
		int isallsame =0;
		
		for (int i = 0; i <test; i++) {
			 s =scanner.nextLine();
			 if(s.length()==1)
				 System.out.println(-1);
			 else if(s.length()==2 && s.charAt(0)==s.charAt(1)){
				 System.out.println(-1);
			 }
			 else if(s.length()==3 && s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2) ){
					System.out.println(-1);
			 }
			 else{
				 char same = s.charAt(0);
				 isallsame =0;
				 palindrom=false;
				 for (int j = 0,m=s.length()-1; j < s.length()/2; j++,m--) {
					if(s.charAt(j)!=s.charAt(m)){
						palindrom=false;
						isallsame=0;
						System.out.println(s);
						break;
					}
					else{
						palindrom=true;
						if(same==s.charAt(j))
							isallsame++;
						continue;
					}
				}
				 if(s.length()%2==0 && isallsame==s.length()/2){
					 System.out.println(-1);
				 }
				 else if(palindrom || (isallsame==s.length()/2) && s.length()%2==1){
					 int count=0;
					 for (int j = 0; j < s.length()-1; j++) {
						 if(s.charAt(j)!=s.charAt(j+1)){
								s=s.substring(j+1)+s.charAt(j)+s.substring(0,j);
								break;
						}
						 else{
							 count++;
						 }
					}
					 if(count>s.length()/2)
						 System.out.println(-1);
					 else
						 System.out.println(s); 
				 }
					 
			}
		}
	}

}

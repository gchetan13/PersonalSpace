package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CrosswordSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] line=scanner.nextLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b=Integer.parseInt(line[1]);
		String s = scanner.nextLine();
		String t = scanner.nextLine();
		char[] schars = s.toCharArray();
		int[] indexes = new int[schars.length];
		int charToChange=a;
		int localcharToChange=a;
		
		for (int i = 0; i < b-a+1; i++) {
			localcharToChange=a;
			for (int j = 0; j <a; j++) {
				 if(t.charAt(i+j)==s.charAt(j)){
					 localcharToChange--;
				 }
			}
			if(localcharToChange<=charToChange){
				charToChange=localcharToChange;
				Arrays.fill(indexes, -1);
				for (int j = 0; j <a; j++) {
					 if(t.charAt(i+j)==s.charAt(j)){
						 indexes[j]=j;
					 }
				}
			}
		}
		System.out.println(charToChange);
		for (int i = 0; i < indexes.length; i++) {
			if(indexes[i]==-1)
				System.out.print(i+1+" ");
		}
	}

}

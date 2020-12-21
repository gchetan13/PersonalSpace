package com.csc.clone.Test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class solution {

	public static void main(String[] args) {


		int[] arr = {2, 0, 1, 1, 2, 3, 1, 5, 5, 5, 1};
		int[] exparr = {2, 1, 2, 1, 2, 3, 1, 2, 1, 2, 1};
		System.out.print("Enter Array");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println("entered String  "+s);
		StringTokenizer tokenizer = new StringTokenizer(s);
		int[] ages = new int[tokenizer.countTokens()];
		int m=0;
		while(tokenizer.hasMoreTokens()){
			ages[m] = Integer.parseInt(tokenizer.nextToken());
			m++;
		}
		int banana[] = new int[ages.length];
		for (int i = 0; i < banana.length; i++) {
				banana[i]=1;
		}
		for (int i = 1; i < ages.length-1; i++) {
				if(ages[i]>ages[i-1] || ages[i]>ages[i+1])
					banana[i]=2;
		}
		for (int i = 1; i < ages.length-1; i++) {
			if(ages[i]>ages[i-1] || ages[i]>ages[i+1])
				if(banana[i-1]>=banana[i] || banana[i+1]>=banana[i])
				banana[i]=banana[i-1]+1;
		}

		if(ages[0]>ages[1]){
			banana[0]=banana[1]+1;
		}else{
			banana[0]=1;
		}if(ages[ages.length-1]>ages[ages.length-2]){
			banana[banana.length-1]=banana[banana.length-2]+1;
		}else{
			banana[banana.length-1]=1;
		}
		for (int i = 0; i < banana.length; i++) {
			System.out.print(banana[i]+" ");
		}
		
			System.out.println();
		for (int i = 0; i < exparr.length; i++) {
			System.out.print(exparr[i]+" ");
		}
		
	
	}

}

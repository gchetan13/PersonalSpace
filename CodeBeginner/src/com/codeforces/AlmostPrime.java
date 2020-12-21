package com.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlmostPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		boolean prime=true;
		int count=1;
		for (int i = 5; i < num*1.5; i+=2) {
			prime=true;
			for(int k=2;k<i/2+1;k++){
				if(i%k==0){
					prime=false;
					break;
				}
								
			}
			if(prime){
				primes.add(i);
			}
		}
		int result=0;
		int index=0;
		int final_result=0;
		for (int j = 6; j < num;  j++) {
			result=0;
			index=0;
			while(j>primes.get(index)){
				if(j%primes.get(index)==0)
					result++;
				index++;
			}
			if(result==2)
				final_result++;
		}
		System.out.println(final_result);
		
	}

}

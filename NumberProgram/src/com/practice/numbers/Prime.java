package com.practice.numbers;

public class Prime {

	public static boolean isPrime(int num){
		if((num*num-1)%24==0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(14));
	}

}

package com.practice.numbers;

public class MultiplyDigits {
 
	private static int multiplydigits(int num){
		int temp = num;
		int digit=0;
		int result =1;
		int count =0;
		int multiplier = 1;
		while(temp%10==0){
			count++; 
			temp = temp/10;
		 }
		
		 if(count!=0)
			multiplier = (int)Math.pow(10, count);

		while(temp/10!=0){
			digit = temp%10;
			if(digit!=0)
			result*= digit;
			else{
				return result*temp*multiplier; 
			}
			temp = temp/10;
		}
		return result*multiplier;
	}
	
	public static void main(String[] args) {
		//System.out.println(multiplydigits(20230));
	//	System.out.println(String.class.getClassLoader());
	//	System.out.println(MultiplyDigits.class.getClassLoader());
		Runtime r = Runtime.getRuntime();
		System.out.println("Max Memory "+r.maxMemory());
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Consumed Memory "+(r.totalMemory()-r.freeMemory()));
}
}

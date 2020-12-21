package com.java.arrays;

public class Shifting {
	static void leftShift(int[] arr,int index){
		
		int len = arr.length;
		int [] shiftedArr = new int[len];
		for (int rev = len-index,j=0; rev<len; rev++,j++) {
			shiftedArr[j] = arr[rev];
		}
		for (int i = index,m=0; m < len-index; i++,m++) {
			shiftedArr[i] = arr[m];
		}
		
		for (int i = 0; i < shiftedArr.length; i++) {
			System.out.print(shiftedArr[i]+"  ");
		}
		System.out.println();
		for (int rev = len-index,j=0; rev<len; rev++,j++) {
			System.out.print(rev+" ");
		}
		for (int i = index,m=0; m < len-index; i++,m++) {
			System.out.print(m+" ");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = new int[]{2,5,1,7,23,43,65};
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i]+ "  ");
		}
		System.out.println();
		leftShift(abc, 3);
		System.out.println();
		for (int i = 0; i < abc.length; i++) {
			System.out.print(i+" ");
		}
	}

}

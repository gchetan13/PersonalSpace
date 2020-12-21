package com.java.arrays;

public class PairInArray {
	private static void sumEqualsPair(int[] abc,int num){
		for (int i = 0; i < abc.length-1; i++) {
			for (int j = i+1; j < abc.length; j++) {
				if(abc[i]+abc[j]==num)
					System.out.println(abc[i]+" "+abc[j]);
			}
		}
		
		
	}
	private static void duplicateElement(int[] xyz){
		int count =0;
		final int arrLen = xyz.length;
		int[] duplicateIndexes = new int[arrLen];
		int m=0;
		int[] newArr = new int[arrLen];
		for (int i = 0; i < xyz.length-1; i++) {
			for (int j = i+1; j < xyz.length; j++) {
				if(xyz[i]==xyz[j]){
					System.out.println("Duplicate Number "+xyz[j]+" index "+j);
					duplicateIndexes[m++]=j;
					//m++;
/*					for (int j2 =j; j2 < xyz.length-1; j2++) {
						xyz[j2]=xyz[j2+1];
						count++;
					}*/
					
				}
			}	
		}
		System.out.println("Printing Array "+count);
		for (int i = 0; i < xyz.length; i++) {
			System.out.print(xyz[i]+" ");
		}
		System.out.println("duplicate indexes");
		for (int j = 0; j < duplicateIndexes.length; j++) {
			System.out.print(duplicateIndexes[j]+" ");
		}
		System.out.println("without duplicates ");
		int k=0;
		for (int i = 0; i < duplicateIndexes.length; i++) {
			for (int j = 1; j < xyz.length; j++) {
				if(duplicateIndexes[i]!=0 && j!=duplicateIndexes[i])
					System.out.print(j+" ");
			}
		}
		System.out.println("Array without duplicates");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pqr = new int[]{11,3,7,13,16,5,11,2,9,2,13,2};
/*		for (int i = 0; i < pqr.length; i++) {
			System.out.print(pqr[i]);
		}*/
		int num=12;
		sumEqualsPair(pqr, num);
		duplicateElement(pqr);
		
	}

}

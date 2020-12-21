package com.sort.insertion;

public class InsertionSort {
	public static void insertionSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int pos=i;
			boolean swap=false;
			for (int j = i; j > 0; j--) {
				if(arr[i]<arr[j]){
					swap=true;		
					pos=j;
				}
			}
			if(swap){
				arr[i] = arr[i] + arr[pos];
				arr[pos] = arr[i] - arr[pos];
				arr[i] = arr[i] - arr[pos];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionSortRec(int[] arr,int n){
		if(n==1){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
			return;
		}	
		else
		{
			for (int j = arr.length - n; j >= 0; j--) {
				if (arr[arr.length - n] < arr[j]) {
					arr[j] = arr[j] + arr[arr.length - n];
					arr[arr.length - n] = arr[j] - arr[arr.length - n];
					arr[j] = arr[j] - arr[arr.length - n];
				}
			}
			insertionSortRec(arr, n-1);
		}
	}
}

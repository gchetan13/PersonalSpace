package com.sort.bubble;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void bubbleRecursion(int[] arr,int n){
		if(n==1){
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			return ;
		}
		else{
			for (int i = 0; i < n-1; i++) {
				if(arr[i]>arr[i+1]){
					arr[i] = arr[i] + arr[i+1];
					arr[i+1] = arr[i] - arr[i+1];
					arr[i] = arr[i] - arr[i+1];
				}
			}
			bubbleRecursion(arr, n-1);
		}
	}
	
}

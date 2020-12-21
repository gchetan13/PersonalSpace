package com.sort.selection;

public class SelectionSort {
	public static void selectionsort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
		}
	}
}

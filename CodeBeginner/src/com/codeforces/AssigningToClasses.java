package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class AssigningToClasses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int arr_len;
		String[] s;
		int[] nums;
		for (int i = 0; i < n; i++) {
			arr_len = Integer.parseInt(scanner.nextLine());
			s = scanner.nextLine().split(" ");
				nums=new int[arr_len*2];
				for (int k = 0; k < arr_len*2; k++) {
					nums[k]=Integer.parseInt(s[k]);
				}
				Arrays.sort(nums);
				System.out.println(nums[arr_len]-nums[arr_len-1]);
		}
	}

}

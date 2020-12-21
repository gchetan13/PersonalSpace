package com.practice.numbers;

import java.util.Arrays;

public class FancyNumber {
   static void findCounts(int arr[], int n)  
    { 
        // Traverse all array elements 
        int i = 0; 
        while (i < n)  
        { 
            // If this element is already processed, 
            // then nothing to do 
            if (arr[i] < 0)  
            { 
                i++; 
                continue; 
            } 
  
            // Find index corresponding to this element 
            // For example, index for 5 is 4 
            int elementIndex = arr[i]; 
  
            // If the elementIndex has an element that is not 
            // processed yet, then first store that element 
            // to arr[i] so that we don't loose anything. 
            if (arr[elementIndex] > 0)  
            { 
                arr[i] = arr[elementIndex]; 
  
                // After storing arr[elementIndex], change it 
                // to store initial count of 'arr[i]' 
                arr[elementIndex] = -1; 
            }  
            else 
            { 
                // If this is NOT first occurrence of arr[i], 
                // then decrement its count. 
                arr[elementIndex]--; 
  
                // And initialize arr[i] as 0 means the element 
                // 'i+1' is not seen so far 
                arr[i] = 0; 
                i++; 
            } 
        } 
  
        System.out.println("Below are counts of all elements"); 
        for (int j = 0; j < n; j++) 
            System.out.println(j + "->" + Math.abs(arr[j])); 
    } 
	
	public static void main(String[] args) {
	
		String num = "9826036827";
		int[] nums = new int[10];
		for (int i = 0; i < num.length(); i++) {
			nums[i] = Integer.parseInt(num.substring(i, i+1));
			System.out.print(nums[i]);
		}
		//Arrays.sort(nums);
		System.out.println(nums);
		int num1,num2,num3;
		for (int i = 0; i < nums.length-2; i++) {
			num1 = nums[i];
			num2 = nums[i+1];
			num3 = nums[i+2];
			System.out.println("for "+num1+" "+num2+" "+num3);

			if(		((num1==num2) && (num2==num3)) ||
					((num1==num2-1) && (num2==num3-1)) ||
					((num1==num2+1) && (num2==num3+1)) )
			{
				System.out.println(num1+" "+num2+" "+num3);
				System.out.println("true");
			}
			
			
		}
		
		System.out.println("==============");
		
		findCounts(nums, 10);
	}
}
